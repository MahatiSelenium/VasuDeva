package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest {

	public static void main(String[] args) throws Exception 
	{
		File srcFile = new File("C:\\Users\\mahat\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(srcFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		// reading single line data
		/*
		 * String data = ws.getRow(0).getCell(0).getStringCellValue(); String data1 =
		 * ws.getRow(0).getCell(1).getStringCellValue();
		 * 
		 * System.out.println(data+"------------"+data1);
		 */
		//column count
		XSSFRow row;
		
		
		//Reading multiple line data
		int rcnt = ws.getLastRowNum();
		System.out.println("row count------"+rcnt);
		
		for (int i = 0; i <= rcnt; i++) 
		{
			row = ws.getRow(i);
			int colCount = row.getLastCellNum();
			System.out.println("column count --------"+colCount);
			for (int j = 0; j < colCount; j++) {
				
			
			String data  = ws.getRow(i).getCell(j).getStringCellValue();
			//String data1 = ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(data+"------------");
			}
			
		}

	}

}
