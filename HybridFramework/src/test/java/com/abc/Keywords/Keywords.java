/*
 * Project Name: BigData
 * Author: Pratik for ibm
 * Client: axis bank
 * Organisation: axis bank
 */

package com.abc.Keywords;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.abc.Constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;
//here all action specific methods
public class Keywords {

/**
 * This method opens different browser using driver instance
 * @param browserName {@code String}
 * @return void
 * @author pratik
 */
	
	public static void openBrowser(String browserName) {
	
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver=new ChromeDriver();
			break;
		
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver=new FirefoxDriver();
			break;
			
		default:
			System.out.println("Invalid Browser Name:" + browserName);
		}
	}
	
	public static void openURL(String url){
		Constants.driver.get(url);
	}
	
	public static void maxWindow() {
		Constants.driver.manage().window().maximize();
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		
		WebElement element=null;
		
		switch (locatorType) {
		
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
			
		case "CSSSELECTOR":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;	
				
		case "ID":
			element=Constants.driver.findElement(By.id(locatorValue));
			break;	
			
		case "NAME":
			element=Constants.driver.findElement(By.name(locatorValue));
			break;
			
		case "CLASSNAME":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
			
		case "TAGNAME":
			element=Constants.driver.findElement(By.tagName(locatorValue));
			break;
			
		case "LINKTEXT":
			element=Constants.driver.findElement(By.linkText(locatorValue));
			break;
			
		case "PARTIALLINKTEXT":
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;	
		default:
			System.err.println("Invalid Locator Type"+ locatorType);
		}
		
		return element;
	}
	
	public static void entertext(String locatorType, String locatorValue, String value ) {
		
		getWebElement(locatorType, locatorValue).sendKeys(value);
	}
	
	public static void clickonBtn(String locatorType, String locatorValue) {
		
		getWebElement(locatorType, locatorValue).click();
	}
	
	
}
