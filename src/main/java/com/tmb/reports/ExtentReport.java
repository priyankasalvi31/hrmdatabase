package com.tmb.reports;

import java.awt.Desktop;
import java.io.File;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tmb.constants.FrameworkConstants;

public final class ExtentReport {
	private ExtentReport()

	{}
		
		private static ExtentReports extent;
		
		public static ExtentTest test;
		
		public static void initReports() throws Exception
		{
			if(Objects.isNull(extent))
			{
				extent =new ExtentReports();
				ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportfilepath());
				extent.attachReporter(spark);
				spark.config().setTheme(Theme.STANDARD);
				spark.config().setDocumentTitle("Test Execution report");
				spark.config().setReportName("Online Execution report");
				
			}
			
			
		}
		
		public static void flushReports() throws Exception
		{
			
			if(Objects.nonNull(extent))
			{
				extent.flush();
				}
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentreportfilepath()).toURI());
		}
		
		public static void createTest(String testcasename)
		{
			
			test=extent.createTest(testcasename);
			ExtentManager.setExtentTest(test);
		}
}
