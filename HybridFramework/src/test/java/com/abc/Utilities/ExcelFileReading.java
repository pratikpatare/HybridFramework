package com.abc.Utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public ExcelFileReading(String excelPath, String sheetName) throws IOException {
	
	workbook=new XSSFWorkbook(excelPath);
	sheet=workbook.getSheet(sheetName);
	
	}
	
	public static Object getCellData(int row, int col) {
		
		DataFormatter formatter=new DataFormatter();
		Object value=formatter.formatCellValue(sheet.getRow(row).getCell(col));
		return value;	
	}
	
}


//public static String excelPath="./TestData/LoginData.xlsx";
//public static String sheetName="Sheet1";


//String proDir=System.getProperty("user.dir");
//System.out.println(proDir);	get project path on this machine