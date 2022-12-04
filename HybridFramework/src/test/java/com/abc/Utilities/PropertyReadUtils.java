package com.abc.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadUtils {	
/*	
	public static String getProperty(String key) throws Exception {
	  String value=null;
	  FileInputStream fis=new FileInputStream("LocatorsObjectRepository/ObjectRepository.properties");
	  Properties prop=new Properties();
	  prop.load(fis);
	  value=prop.getProperty(key);
	  return value; }
*/	 
/*	
	public static String getProperty(String key, String filePath) throws Exception {
	  String value=null;
	  FileInputStream fis=new FileInputStream(filePath);
	  Properties prop=new Properties();
	  prop.load(fis);
	  value=prop.getProperty(key);
	  return value; }
*/ 

	public static String[] getProperty(String key, String filepath) throws IOException {
	
		String[] values=null;
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		String partValue=prop.getProperty(key);
		values=partValue.split("#");
		return values;
	}

}