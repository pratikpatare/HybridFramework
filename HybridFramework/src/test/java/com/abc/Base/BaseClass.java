/*
 * Project Name: BigData
 * Author: Pratik for ibm
 * Client: axis bank
 * Organisation: axis bank
 */
package com.abc.Base;

import com.abc.Keywords.Keywords;
import com.abc.Utilities.PropertyReadUtils;

public class BaseClass {

	public static void openbase() throws Exception {
		
	Keywords.openBrowser(PropertyReadUtils.getProperty("browserName","Resources/Application.properties")[0]);
	
	Keywords.maxWindow();
	
	Keywords.openURL(PropertyReadUtils.getProperty("aut.url","Resources/Application.properties")[0]);
		
		
	}
	
}
