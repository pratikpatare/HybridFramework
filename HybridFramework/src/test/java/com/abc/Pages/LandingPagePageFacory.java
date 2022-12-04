package com.abc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPagePageFacory {
	
//WebElements >> LocatorType and LocatorValue
//WebElement specific methods>>
		
//Implement POM design pattern by using PageFactory so no need to create object in Test
	
	@FindBy(id="email") WebElement email;
	@FindBy(name="pass") WebElement password;
	@FindBy(name="login") WebElement loginBtn;
//	@FindBy(how=How.NAME, using="login") WebElement login;
	
	public void enterEmail(String email1) {
		email.sendKeys("pratik");	
	}

	public void enterPassword(String password1) {
		password.sendKeys("patare");
	}
	
	public void clickonBtn() {
		loginBtn.click();
	}
}