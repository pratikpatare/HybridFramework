package com.abc.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.abc.Base.BaseClass;
import com.abc.Keywords.Keywords;
import com.abc.Utilities.ExcelFileReading;
import com.abc.Utilities.PropertyReadUtils;

public class LoginTest {

	@Test
	public void TC_001() throws Exception {
		
		BaseClass.openbase();
		
		ExcelFileReading excel=new ExcelFileReading("./TestData/LoginData.xlsx", "Sheet1");
		
		Keywords.entertext(PropertyReadUtils.getProperty("email", "LocatorsObjectRepository/ObjectRepository.properties")[0],
						   PropertyReadUtils.getProperty("email","LocatorsObjectRepository/ObjectRepository.properties")[1],
						   excel.getCellData(1, 0).toString());
		
		
		Keywords.entertext(PropertyReadUtils.getProperty("password","LocatorsObjectRepository/ObjectRepository.properties")[0],
						   PropertyReadUtils.getProperty("password","LocatorsObjectRepository/ObjectRepository.properties")[1],
						   excel.getCellData(1, 1).toString());
		
		
		Keywords.clickonBtn(PropertyReadUtils.getProperty("loginbtn","LocatorsObjectRepository/ObjectRepository.properties")[0],
							PropertyReadUtils.getProperty("loginbtn","LocatorsObjectRepository/ObjectRepository.properties")[1]);
	}
	
	
	
}
