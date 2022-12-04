package com.abc.TestScripts;

import org.testng.annotations.Test;

import com.abc.Base.BaseClass;
import com.abc.Pages.LandingPageBy;

public class LandingByTest {
	
	@Test
	public void TC_002() throws Exception {
		
		BaseClass.openbase();
		LandingPageBy lp=new LandingPageBy();
		lp.enterEmail("pratik");
		lp.enterPass("patare");
	}
	
	
}
