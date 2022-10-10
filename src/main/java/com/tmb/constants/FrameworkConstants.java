package com.tmb.constants;

import java.time.Duration;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";

	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";

	private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	
	private static final int EXPLICITWAIT =10;

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}
}
