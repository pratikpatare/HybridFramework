package com.abc.Pages;

import org.openqa.selenium.By;

import com.abc.Constants.Constants;

public class LandingPageBy {
//WebElements >> LocatorType and LocatorValue
//WebElement specific methods>>
	
//Implement POM design pattern by using By class (traditional way) so need to create object in Test
	
	By email=By.id("email");
	By password=By.name("pass");
	
	public void enterEmail(String email1) {
		Constants.driver.findElement(email).sendKeys(email1);
		
	}
	
	public void enterPass(String password1) {
		Constants.driver.findElement(password).sendKeys(password1);
	}
	
	
}
