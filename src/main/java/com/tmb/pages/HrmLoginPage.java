package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public class HrmLoginPage {

	private final By textboxUsername = By.name("username");
	private final By textboxPassword = By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password']");
	private final By buttonLogin = By.xpath("//button[@type='submit']");

	public HrmLoginPage enterUserName(String username) {

		DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
		return this;
	}

	public HrmLoginPage enterPassword(String password) {

		DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {

		DriverManager.getDriver().findElement(buttonLogin).click();
		return new OrangeHRMHomePage();
	}

	
}
