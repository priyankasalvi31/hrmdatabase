package com.tmb.constants;

import java.time.Duration;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

public final class FrameworkConstants {

	private FrameworkConstants() {
	}

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	private static final String JSONCONFIGFILEPATH = RESOURCESPATH + "/json/Chrome.json";
	private static final String EXTENTREPORTFOLDERPATH =System.getProperty("user.dir")+"/extent-test-output";
	private static final String EXCELPATH =RESOURCESPATH +"/excel/testdata.xlsx";
	
	public static String getExcelpath() {
		return EXCELPATH;
	}

	private static  String EXTENTREPORTFILEPATH ="";
	private static final int EXPLICITWAIT =10;
	
	/**
	 * @return the extentreportpath
	 * @throws Exception 
	 */
	

	/**
	 * @return the extentreportfilepath
	 * @throws Exception 
	 */
	public static String getExtentreportfilepath() throws Exception {
		if(EXTENTREPORTFILEPATH.isEmpty()) {
			
			EXTENTREPORTFILEPATH=createreportpath();
		}

		return EXTENTREPORTFILEPATH;
	}	

	public static String createreportpath() throws Exception
	{
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no"))
		{
		return EXTENTREPORTFOLDERPATH+"/"+System.currentTimeMillis()+"index.html";
		}
		else
		{
			return EXTENTREPORTFOLDERPATH+"/"+"index.html";
			
		}
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getJsonconfigfilepath() {
		return JSONCONFIGFILEPATH;
	}
}
