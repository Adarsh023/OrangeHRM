package com.selweb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldatareader {
	
	static XSSFWorkbook xsw;
	 XSSFSheet xss;
	public Exceldatareader()
	{
		File src = new File("C:\\Users\\ADARSH\\eclipse-workspace\\OrangeHRM\\TestDataFile\\TestData.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			xsw= new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			System.out.println("excel file not loaded");
		}
		
	}
	public String getstringgetdata(String sheetname, int rownum, int cellnum) {
		
		return xsw.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
    public String getnumericgetdata(String sheetname, int rownum, int cellnum) {
		
		return xsw.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
