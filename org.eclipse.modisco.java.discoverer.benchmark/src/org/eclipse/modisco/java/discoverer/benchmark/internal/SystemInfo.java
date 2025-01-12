/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.internal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SystemInfo {

	private static SystemInfo instance;
	private String procName;
	private String procDescription;
	private String procCacheSize;
	private String memory;
	private String osName;
	private String osVersion;
	private String arch;
	private int nProcessors;

	private SystemInfo() throws IOException {
		computeInfo();
	}

	public String getArch() {
		return this.arch;
	}

	public String getMemory() {
		return this.memory;
	}

	public int getnProcessors() {
		return this.nProcessors;
	}

	public String getOsName() {
		return this.osName;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public String getProcDescription() {
		return this.procDescription;
	}

	public String getProcCacheSize() {
		return this.procCacheSize;
	}

	public String getProcName() {
		return this.procName;
	}

	/**
	 * @return an instance of SystemInfo
	 * @throws IOException
	 *             in case of error retrieving system information
	 */
	public static synchronized SystemInfo getInstance() throws IOException {
		if (SystemInfo.instance == null) {
			SystemInfo.instance = new SystemInfo();
		}
		return SystemInfo.instance;
	}

	private void computeInfo() throws IOException {
		OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();
		this.osName = bean.getName();
		this.osVersion = bean.getVersion();
		this.arch = bean.getArch();
		this.nProcessors = bean.getAvailableProcessors();

		this.procName = ""; //$NON-NLS-1$
		this.procDescription = ""; //$NON-NLS-1$
		this.procCacheSize = ""; //$NON-NLS-1$
		this.memory = ""; //$NON-NLS-1$

		if (this.osName.contains("Windows")) { //$NON-NLS-1$

			String nl = System.getProperty("line.separator"); //$NON-NLS-1$
			StringBuilder script = new StringBuilder();
			script.append("On Error Resume Next" + nl); //$NON-NLS-1$
			// processor
			script.append("Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")" + nl); //$NON-NLS-1$
			script.append("Set colItems = objWMIService.ExecQuery(\"Select * from Win32_Processor\",,48)" + nl); //$NON-NLS-1$
			script.append("For Each objItem in colItems" + nl); //$NON-NLS-1$
			script.append("Wscript.Echo \"Name: \" & objItem.Name" + nl); //$NON-NLS-1$
			script.append("Wscript.Echo \"Description: \" & objItem.Description" + nl); //$NON-NLS-1$
			script.append("Wscript.Echo \"L2CacheSize: \" & objItem.L2CacheSize" + nl); //$NON-NLS-1$
			script.append("Next" + nl); //$NON-NLS-1$
			// memory
			script.append("Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")" + nl); //$NON-NLS-1$
			script.append("Wscript.Echo \"memory\"" + nl); //$NON-NLS-1$
			script.append("Set colItems2 = objWMIService.ExecQuery(\"Select * from Win32_PhysicalMemory\",,48)" + nl); //$NON-NLS-1$
			script.append("For Each objItem in colItems2" + nl); //$NON-NLS-1$
			script.append("Wscript.Echo \"Capacity: \" & objItem.Capacity" + nl); //$NON-NLS-1$
			script.append("Next" + nl); //$NON-NLS-1$

			File scriptFile = File.createTempFile("systemInfoScript", ".vbs"); //$NON-NLS-1$ //$NON-NLS-2$
			scriptFile.deleteOnExit();
			Writer writer = new BufferedWriter(new FileWriter(scriptFile));
			try {
				writer.write(script.toString());
			} finally {
				writer.close();
			}

			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("cscript.exe", scriptFile.getPath()); //$NON-NLS-1$
			Process process = processBuilder.start();
			InputStream inputStream = process.getInputStream();
			String result = readStream(inputStream);

			this.procName = getInfo("Name", result); //$NON-NLS-1$
			this.procDescription = getInfo("Description", result); //$NON-NLS-1$
			this.procCacheSize = getInfo("L2CacheSize", result); //$NON-NLS-1$
			List<String> infos = getInfos("Capacity", result); //$NON-NLS-1$
			long mem = 0;
			for (String info : infos) {
				mem += Long.parseLong(info);
			}
			this.memory = "" + mem; //$NON-NLS-1$
		} else {
			// processor
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("cat", "/proc/cpuinfo"); //$NON-NLS-1$ //$NON-NLS-2$
			Process process = processBuilder.start();
			InputStream inputStream = process.getInputStream();
			String result = readStream(inputStream);

			this.procName = getInfo("model name", result); //$NON-NLS-1$
			this.procDescription = getInfo("flags", result); //$NON-NLS-1$
			this.procCacheSize = getInfo("cache size", result); //$NON-NLS-1$

			// memory
			processBuilder = new ProcessBuilder();
			processBuilder.command("cat", "/proc/meminfo"); //$NON-NLS-1$ //$NON-NLS-2$
			process = processBuilder.start();
			inputStream = process.getInputStream();
			result = readStream(inputStream);

			this.memory = getInfo("MemTotal", result); //$NON-NLS-1$
		}
	}

	private static String getInfo(final String name, final String result) {
		List<String> infos = getInfos(name, result);
		if (infos.size() > 0) {
			return infos.get(0);
		}
		return ""; //$NON-NLS-1$
	}

	private static List<String> getInfos(final String name, final String result) {
		Pattern patternName = Pattern.compile(name + "\\s*:\\s*(.*)"); //$NON-NLS-1$
		Matcher matcher = patternName.matcher(result);
		List<String> infos = new ArrayList<String>();
		while (matcher.find()) {
			infos.add(matcher.group(1).trim());
		}
		return infos;
	}

	private static String readStream(final InputStream inputStream) throws IOException {
		StringBuilder builder = new StringBuilder();
		try {
			final int bufferSize = 65536;
			char[] buffer = new char[bufferSize];
			Reader reader = new BufferedReader(new InputStreamReader(inputStream));
			int n;
			while ((n = reader.read(buffer)) != -1) {
				builder.append(buffer, 0, n);
			}
		} finally {
			inputStream.close();
		}
		return builder.toString();
	}
}
