package com.bitrix24.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bitrix24.qa.Pages.LogInPage;
import com.bitrix24.qa.base.testBase;


public class LogInPageTest extends testBase {

	LogInPage loginPage;
	public LogInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
	testBase.initialization();
	loginPage = new LogInPage();
	
	
	
}
	
	@Test
	public void  validateLoginpage() throws InterruptedException {
		
		loginPage.loginwithvalidcredentials();
		//Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "Bitrix24.Network profile");
	}
	
	
	




	@AfterMethod
	public void tearDown() {
		driver.quit();
	}




}