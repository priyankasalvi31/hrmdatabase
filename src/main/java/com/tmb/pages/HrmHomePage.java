package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;
import com.tmb.reports.ExtentLogger;

public class HrmHomePage extends BasePage {
	private final By linkWelcome =By.xpath("//p[@class='oxd-userdropdown-name']");

	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public HrmHomePage clickWindow() throws Exception
	{
	click(linkWelcome,WaitStrategy.PRESENCE,"Welcome Link");
	
	return this;

	}

	public HrmLoginPage clickLogout() throws Exception
	{
	// Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		click(linkLogout,WaitStrategy.PRESENCE,"logout button");
	
	ExtentLogger.pass("Logout clicked");
	return new HrmLoginPage();

	}
}
