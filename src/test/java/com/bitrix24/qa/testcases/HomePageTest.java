package com.bitrix24.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bitrix24.qa.Pages.HomePage;
import com.bitrix24.qa.Pages.LogInPage;
import com.bitrix24.qa.base.testBase;

public class HomePageTest extends testBase {
	LogInPage loginPage;
	HomePage homePage;
	
	//homePage = loginPage.loginwithvalidcredentials();
	
	
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		testBase.initialization();
		loginPage =new LogInPage();
		homePage = new HomePage();
		loginPage.loginwithvalidcredentials();
		
	}
	
	@Test(priority =2)
	public void validateCRMLink() throws InterruptedException {
	
		
		homePage.createnewcontact();
	
	}
	
	@Test(priority=1)
	public void verifyTiitle() {
		
		homePage.validatetitle();
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
