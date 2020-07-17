package com.bitrix24.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bitrix24.qa.TestUtil.WaitDriverWait;
import com.bitrix24.qa.base.testBase;

public class HomePage extends testBase {
	
	@FindBy(xpath = "//span[text()='CRM']")
	WebElement CrmLink;
	
	
	@FindBy(xpath = "//span[@class='main-buttons-item-text-title'][contains(text(),'Contacts')]")
	WebElement Contacts;
	
	
	
	@FindBy(xpath = "//body[@class='b24network-account-main']/div[@class='b24network-account']/div[@class='b24network-account-col']/div[@class='b24network-account-block "
			+ "js-24network-account-block']/div[@class='b24network-profile-list']/div[1]/a[1]")
	WebElement GoLink;
	
	@FindBy(xpath ="//span[text()='Calendar' and @data-role='item-text']")
	WebElement CalendarLink;
	
	public HomePage() {
		PageFactory.initElements(driver,this );
		
	}
	
	/*public void clickonGolink() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(GoLink));
				
		GoLink.click();	
	}*/
		
	public CRMPage createnewcontact() throws InterruptedException {
		
		//GoLink.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(CrmLink));
				
		driver.findElement(By.xpath("//span[text()='CRM']")).click();
		//CrmLink.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(Contacts));
				
		Contacts.click();
			
		return new CRMPage();
			
	}
	
	public void validatetitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My tasks");
	
	
	}
	public Calendar usercanaddevent() {
		CalendarLink.click();
		return new Calendar();
	}
	
	
}
