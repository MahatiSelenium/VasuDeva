package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest 
{

	public static void main(String[] args) throws Exception 
	{
		
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sample");
		
		
		//reading single set of data
		/*String data=ws.getRow(0).getCell(0).getStringCellValue();
		
		String data1=ws.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data+"  ----  "+data1);*/
		
		//reading multiple sets of data
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 0; i <=rcnt; i++)
		{
			String data=ws.getRow(i).getCell(0).getStringCellValue();
			
			String data1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(data+"  ----  "+data1);
		}

	}

}
