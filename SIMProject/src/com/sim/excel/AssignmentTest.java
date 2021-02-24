package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentTest 
{

	public static void main(String[] args) throws IOException
	{
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sample");
		
		
		//reading single set of data
		
		String celldata="";
		for (int i = 0; i <=ws.getLastRowNum(); i++)
		{
			if(ws.getRow(i).getCell(1).getCellType()==CellType.NUMERIC)
			{
				
				int data=(int)ws.getRow(i).getCell(1).getNumericCellValue();
				
				celldata=String.valueOf(data);
				
				
			}else
			{
				celldata=ws.getRow(i).getCell(1).getStringCellValue();
			}
			
			System.out.println(celldata);
		}
		

	}

}
