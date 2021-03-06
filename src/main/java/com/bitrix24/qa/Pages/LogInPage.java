package com.bitrix24.qa.Pages;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bitrix24.qa.base.testBase;

public class LogInPage extends testBase{


	@FindBy(xpath="//input[@id='login' and @type='text']")
	WebElement Email;
	
	@FindBy(xpath="//span[contains(text(),'Log in with')]")
	WebElement LogInOption;
	
	@FindBy(xpath = "//div[@class='b24-network-auth-form-btn-block']//following-sibling::button[@data-action='submit']")
	WebElement NexttabLink;
	
	@FindBy(xpath = "//span[text()='Bitrix24 Login']")
	WebElement Bitrix24_Login;	
	
	@FindBy(xpath = "//button[text()='Forgot password?']")
	WebElement ForgotLink;
	
	@FindBy(xpath = "//div[@class='b24-network-auth-form-footer-block']//following-sibling::a[text()='Need help']")
	WebElement Needhelplink;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath = "//span[text()='Google']") 
	WebElement Loginwithgoogle;
	
	@FindBy(xpath = "//div[text()='bhissma.thapa@gmail.com']")
	WebElement SigninwithGoogle;
	
	@FindBy(xpath ="//input[@type='email' and @class='whsOnd zHQkBf']")
	WebElement Google;
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	WebElement Nextgoogle;
	
//	@FindBy(xpath = "//body[@class='b24network-account-main']/div[@class='b24network-account']/div[@class='b24network-account-col']/div[@class='b24network-account-block js-24network-account-block']/div[@class='b24network-profile-list']/div[1]/a[1]")
	
	@FindBy(xpath="//*[text()='b24-koc0ox.bitrix24.com']")
	WebElement GoLink;
	
	public LogInPage () {
	PageFactory.initElements(driver,this);

}

	public HomePage loginwithvalidcredentials() throws InterruptedException {
		
		
		Email.sendKeys(prop.getProperty("email"));
		Thread.sleep(3000);
		NexttabLink.click();
		
		Password.sendKeys(prop.getProperty("password"));
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(NexttabLink));
		Thread.sleep(5000);	
		NexttabLink.click();
		Thread.sleep(5000);
		try {
		 
		driver.findElement(By.xpath("//a[@class='ui-btn ui-btn-sm ui-btn-primary ui-btn-round b24network-profile-item-btn']"));	
		}
		catch (StaleElementReferenceException e)
		{
		
			driver.findElement(By.xpath("//a[@class='ui-btn ui-btn-sm ui-btn-primary ui-btn-round b24network-profile-item-btn']"));	
		}
		//StaleElementReferenceException
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ui-btn ui-btn-sm ui-btn-primary ui-btn-round b24network-profile-item-btn']")).click();
		return new HomePage();
	}

	








}