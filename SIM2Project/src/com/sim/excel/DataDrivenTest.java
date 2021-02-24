package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sim.methods.PrimusBank;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception 
	{
		PrimusBank app = new PrimusBank();
		
		app.appLaunch("http://primusbank.qedgetech.com/");
		app.appLogin("Admin", "Admin");
		
		//Branch creation for multiple set of data from excel
		//Reading Data from excel
		File srcFile = new File("C:\\Users\\mahat\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(srcFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rcnt = ws.getLastRowNum();
		
		for (int i = 1; i <= rcnt; i++)
		{
			String bName = ws.getRow(i).getCell(0).getStringCellValue().trim();
			String add1 = ws.getRow(i).getCell(1).getStringCellValue().trim();
			
			System.out.println("Reading  "+i+"   set of data: "+bName+"  "+add1);
			
			//calling breanch creation
			String results = app.branchCreation(bName, add1);
			
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos = new FileOutputStream(srcFile);
			wb.write(fos);
			
		}
		
		wb.close();
		app.appLogout();
		app.appClose();
		
		
		

	}

}
