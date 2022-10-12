package com.tmb.tests;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import com.tmb.pages.HrmLoginPage;

public final class HomepageTests extends BaseTest {

	private HomepageTests()
	{
		
	}
	
@Test(dataProvider ="LoginTestDataProvider" )

	public void loginLogout(String username,String password) throws Exception
	
	{
		Thread.sleep(10000);

	String Title =new HrmLoginPage()
			.enterUserName(username)
			.enterPassword(password)
			.clickLogin()
			.clickWindow()
			.clickLogout()
	.getTitle();
	
	Assertions.assertThat(Title)
	.isEqualTo("OrangeHRM");
		
		
	}
@Test(dataProvider ="LoginTestDataProvider" )	
public void newTest(String username,String password) throws Exception
	
	{
		Thread.sleep(10000);

	String Title =new HrmLoginPage()
			.enterUserName(username)
			.enterPassword(password)
			.clickLogin()
			.clickWindow()
			.clickLogout()
	.getTitle();
	
	Assertions.assertThat(Title)
	.isEqualTo("OrangeHRM");
		
		
	}
	@DataProvider(name="LoginTestDataProvider",parallel = true)
	public Object[][] getData()
	{
		
		
		return new Object[][]
				{
			{"Admin","admin123"}
		
	
			
				};
		
	}
}
