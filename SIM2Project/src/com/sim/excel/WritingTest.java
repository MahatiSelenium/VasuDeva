package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest {

	public static void main(String[] args) throws Exception 
	{
		File srcFile = new File("C:\\Users\\mahat\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(srcFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		ws.getRow(1).createCell(2).setCellValue("Vasudeva");
		ws.getRow(2).createCell(2).setCellValue("Training");
		
		FileOutputStream fos = new FileOutputStream(srcFile);
		wb.write(fos);
		
		wb.close();

	}

}
