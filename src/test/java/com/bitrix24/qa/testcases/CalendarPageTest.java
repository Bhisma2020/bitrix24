package com.bitrix24.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bitrix24.qa.Pages.Calendar;
import com.bitrix24.qa.Pages.HomePage;
import com.bitrix24.qa.Pages.LogInPage;
import com.bitrix24.qa.base.testBase;

public class CalendarPageTest extends testBase {

	LogInPage loginPage;
	HomePage homePage;
	Calendar calendar;
	
	
	
	public CalendarPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		testBase.initialization();
		loginPage = new LogInPage();
		homePage = new HomePage();
		calendar = new Calendar();
		loginPage.loginwithvalidcredentials();
		homePage.usercanaddevent();
	}
	
	
	@Test(priority=1)
	public void verifyuserisinCalendarPage() {
		calendar.verifycalendarpage();
	}
	
	@Test(priority =2)
	public void verifyusercancreatenewEvent() throws InterruptedException {
		calendar.createnewevent();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
