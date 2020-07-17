package com.bitrix24.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bitrix24.qa.base.testBase;

public class Calendar extends testBase{

	@FindBy(xpath ="//span[text()='Calendar' and @data-role='item-text']")
	WebElement CalendarLink;
	
	@FindBy(xpath ="//span[text()='My Calendar']")
	WebElement Mycalendar;
	
	@FindBy(xpath ="//button[@class='ui-btn-main']")
	WebElement Addcalendar;
	
	@FindBy(xpath ="//*[@name='date_from']")
	WebElement Datefrom;
	
	@FindBy(xpath ="//*[@data-date='1594857600000']")
	WebElement Startdate;
	
	
	@FindBy(xpath ="//*[@name='time_from']")
	WebElement Starttime;
	
	@FindBy(xpath ="//*[@name='date_to']")
	WebElement Enddate;
	
	@FindBy(xpath ="//*[@name='time_from']")
	WebElement Endingdate;
	
	@FindBy(xpath ="//*[@name='time_to']")
	WebElement Endingtime;
	
	@FindBy(xpath ="//*[text()='(Ctrl+Enter)']")
	WebElement Save;
	
	@FindBy(xpath="//span[text()='Delete']")
	WebElement Delete;
	
	@FindBy(xpath ="//iframe[@id='maininterfacebuttons-tmp-frame-top_menu_id_calendar']")
	WebElement Frame;
	
	public Calendar() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void createnewevent() throws InterruptedException {
		CalendarLink.click();
		//Thread.sleep(3000);
		Mycalendar.click();
//		/Thread.sleep(3000);
		
		
		//Thread.sleep(5000);
		Addcalendar.click();
		
		Datefrom.click();
		
		Startdate.click();
		
		Starttime.click();
		
		Enddate.click();
		
		Endingdate.click();
				
		Endingtime.click();
		
		Save.click();
		
		//driver.switchTo().defaultContent();
	}
	
	/*
	public void verifycalendarpage() {
	
		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s, "Bhisma Thapa: Calendar");
		
	}*/
	
}
