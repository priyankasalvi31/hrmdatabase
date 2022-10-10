package com.tmb.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tmb.driver.DriverManager;

public class OrangeHRMHomePage extends BasePage {

	private final By linkWelcome =By.xpath("//p[@class='oxd-userdropdown-name']");
			
	private final By linkLogout = By.xpath("//a[text()='Logout']");		
	
	public OrangeHRMHomePage clickWindow()
	{
		DriverManager.getDriver().findElement(linkWelcome).click();
		return this;
		
	}
	
	public HrmLoginPage clickLogout()
	{
	//	Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(linkLogout));
		DriverManager.getDriver().findElement(linkLogout).click();
		return new HrmLoginPage();
		
	}

	
	}
	

