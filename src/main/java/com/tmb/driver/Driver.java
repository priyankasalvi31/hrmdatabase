package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.constants.FrameworkConstants;
import com.tmb.utils.PropertyUtils;

public final class Driver {
	
	private Driver()
	{
		
		
	}
	private static WebDriver driver;
	

public static void initDriver() throws Exception
{
	System.out.println(Thread.currentThread().getId()+" : "+Driver.driver);
	if(Objects.isNull(DriverManager.getDriver()))
	{
	System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
	
	DriverManager.setDriver(new ChromeDriver());
	DriverManager.getDriver().get(PropertyUtils.get("url"));
	}
	
}

public static void quitDriver()
{
	if(Objects.nonNull(DriverManager.getDriver()))
	{
		DriverManager.getDriver().quit();
		DriverManager.unload();
	}
}
}
