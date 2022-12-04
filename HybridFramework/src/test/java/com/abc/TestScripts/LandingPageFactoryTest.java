package com.abc.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.abc.Base.BaseClass;
import com.abc.Constants.Constants;
import com.abc.Pages.LandingPagePageFacory;

public class LandingPageFactoryTest {

	@Test
	public void TC_002() throws Exception {

		BaseClass.openbase();
		LandingPagePageFacory lp=PageFactory.initElements(Constants.driver, LandingPagePageFacory.class);
		lp.enterEmail("pratik");
		lp.enterPassword("patare");
		lp.clickonBtn();
	}
	
	
	
}
