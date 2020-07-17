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
		homePage = loginPage.loginwithvalidcredentials();
	}
	
	@Test(priority =1)
	public void clickCRM() throws InterruptedException {
	
		
		homePage.createnewcontact();
		
	
	}
	
//	@Test(priority=1)
//	public void verifyTiitle() throws InterruptedException {
//		homePage.validatetitle();
//	
//	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
