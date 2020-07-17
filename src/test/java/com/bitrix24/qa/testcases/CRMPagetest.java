package com.bitrix24.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bitrix24.qa.Pages.CRMPage;
import com.bitrix24.qa.Pages.Calendar;
import com.bitrix24.qa.Pages.HomePage;
import com.bitrix24.qa.Pages.LogInPage;
import com.bitrix24.qa.base.testBase;

public class CRMPagetest extends testBase {

	 LogInPage loginPage;
	 HomePage homePage;
	 CRMPage crmPage;	
	 Calendar calendar;
	
	public CRMPagetest () {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		testBase.initialization();
		loginPage = new LogInPage();
		homePage = new HomePage();
		crmPage = new CRMPage();
		calendar = new Calendar();
		
		homePage=loginPage.loginwithvalidcredentials();
		crmPage = homePage.createnewcontact();
	}
	
	@Test
	public void validatecrmtabisClicked() throws InterruptedException, IOException {

		//homePage.clickonGolink();
		crmPage.CRMtabisclickabel();
	
		
		
	}
	

	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	
	} 
	
	
}
