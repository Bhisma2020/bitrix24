package com.bitrix24.qa.Pages;

import java.io.IOException;
import java.util.List;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bitrix24.qa.TestUtil.WaitDriverWait;
import com.bitrix24.qa.base.testBase;

public class CRMPage extends testBase {
	
	
	@FindBy(xpath = "//a[@class='ui-btn ui-btn-primary ui-btn-icon-add crm-btn-toolbar-add']")
	WebElement AddcontactsLink;
	
	@FindBy(xpath ="//input[@name ='LAST_NAME' and @type='text']")
	WebElement Lastname;
	
	@FindBy(xpath = "//input[@name ='NAME' and @type='text']")
	WebElement Firstname;
	
	@FindBy(xpath="//button[@class='ui-btn ui-btn-success']")
	WebElement SaveTab;
	

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath ="//a[text()='General']")
	WebElement GeneralFrame;
	
	@FindBy(xpath ="//iframe[@class='side-panel-iframe']")
	WebElement frame;
	
	@FindBy(xpath ="//div[@class ='crm-entity-widget-content-select active']")
	WebElement Salutation;
	
	@FindBy(xpath ="//*[text()='Not selected']")
	WebElement dropdown;
	
	@FindBy(xpath ="//*[text()='Mr.']")
	WebElement selectMr;
	
	@FindBy(xpath ="//input[@name='BIRTHDATE']")
	WebElement Date;
	
	@FindBy(xpath ="//input[@name='POST']")
	WebElement Post;
	
	@FindBy(xpath ="//span[text()='Mobile']")
	WebElement contactOption;
	
	@FindBy(xpath="//div[text()='Work Phone']")
	WebElement clickphone;
	
	@FindBy(xpath="//input[contains(@class,'crm-entity-widget-content-input crm-entity-widget-content-input-phone')]")
	WebElement Phoneno;
	
	@FindBy(xpath="//span[contains(@class,'side-panel-label')]")
	WebElement close;
	
	@FindBy(xpath = "//span[@class='side-panel-label-text']")
	WebElement Frame;
	
	@FindBy(xpath ="//table[@id='CRM_CONTACT_LIST_V12_table']//input[@id='CRM_CONTACT_LIST_V12_check_all']")
	WebElement Checkbox;
	
	@FindBy(xpath ="//span[@id='grid_remove_button_control']")
	WebElement Delete;
	
	@FindBy(xpath ="//span[contains(text(),'Continue')]")
	WebElement Continue;
	
	public CRMPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void CRMtabisclickabel() throws InterruptedException, IOException {
		
		AddcontactsLink.click();
		
		driver.switchTo().frame(frame);
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
				
		dropdown.click();
		selectMr.click();
		Lastname.sendKeys("magar");
		Firstname.sendKeys("bhisma");
		
//		driver.get("C:\\Users\\Bhisma\\Desktop\\auto.html");
//		driver.findElement(By.xpath("//*[@id ='1' and @type='file']")).click();
//		Runtime.getRuntime().exec("C:\\Users\\Bhisma\\Desktop\\auto.exe");
//		Thread.sleep(3000);
		Date.sendKeys("1/05/1980");
		Post.sendKeys("Lead");
		
		Phoneno.sendKeys("9012345678");
		clickphone.click();
		contactOption.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(SaveTab));
		SaveTab.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(SaveTab));
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		close.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.elementToBeClickable(Checkbox));
		Checkbox.click();
		Delete.click();
		//Thread.sleep(5000);
		Continue.click();
		
	}
	
}
