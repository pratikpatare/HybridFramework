package com.abc.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ApplicationProperty {

	public static String getAppProperty(String key) throws Exception {
		String value=null;
		FileInputStream fis=new FileInputStream("Resources/Application.properties");
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
		return value;
		}	
}
