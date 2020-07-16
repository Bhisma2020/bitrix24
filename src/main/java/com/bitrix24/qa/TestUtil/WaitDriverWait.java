package com.bitrix24.qa.TestUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bitrix24.qa.base.testBase;



public class WaitDriverWait extends testBase {
	static WebDriver driver;
//	public static void webdriverWait(WebElement element) {
//	
//	WebDriverWait wait = new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
//	
//}
	
	public static void webDriverWaitClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void javascripts(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();",element );
	}
	
	
	public static void LoopSalutation(WebElement salutation,String value) {
		
		List<WebElement> sallist = (List<WebElement>) driver.findElement(By.xpath("//div[text()='Not selected']"));
		System.out.println(sallist.size());
		
	}
	
	
	
	
	
	
	
}
