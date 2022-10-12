package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public class HrmLoginPage extends BasePage {
	private final By textboxUsername = By.name("username");
	private final By textboxPassword = By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password']");
	private final By buttonLogin = By.xpath("//button[@type='submit']");

	public HrmLoginPage enterUserName(String username) throws Exception {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE,"Username");

	
		return this;
	}

	public HrmLoginPage enterPassword(String password) throws Exception {

		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE,"Password");
		return this;
	}

	public HrmHomePage clickLogin() throws Exception {

		click(buttonLogin, WaitStrategy.PRESENCE, "Login button");
		return new HrmHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
	}
}
