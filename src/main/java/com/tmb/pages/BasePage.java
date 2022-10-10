package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public class BasePage {

	protected void click(By by, WaitStrategy waitstrategy) {
		explicitlyWaitForElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).click();

	}

	protected void sendKeys(By by, String value) {
		explicitlyWaitForElementToBePresent(by);
		DriverManager.getDriver().findElement(by).sendKeys(value);

	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

	private void explicitlyWaitForElementToBeClickable(By by) {

		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitwait()))
				.until(ExpectedConditions.elementToBeClickable(by));
	}

	private void explicitlyWaitForElementToBePresent(By by) {

		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitwait()))
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}

}
