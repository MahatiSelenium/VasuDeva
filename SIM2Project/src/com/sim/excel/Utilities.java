package com.sim.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities
{
	Workbook wb;
	Sheet ws;
	// this contructor is used to load the excel sheet
	public Utilities() throws Exception
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\mahat\\eclipseNew\\SIMProject\\TestInputs\\Inputs.xlsx");
		wb= WorkbookFactory.create(fis);
	}
	//row count
	 public int rowCount(String sheetName)
	 {
		  return wb.getSheet(sheetName).getLastRowNum();
	 }
	 //column count
	 public int colCount(String sheetName, int row)
	 {
		 return wb.getSheet(sheetName).getRow(row).getLastCellNum();
	 }
	 //Reading Data from Excel
	 public String getData(String sheetName,int row,int column)
	 {
		 String data ="";
		 if(wb.getSheet(sheetName).getRow(row).getCell(column).getCellType()==CellType.NUMERIC)
		 {
			 int cellData =(int) wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
			 data = String.valueOf(cellData);
		 }else 
		 {
			 data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue().trim();

		 }
		 return data;
			 
	 }
	 // writing data into Excel
	 public void writeData(String sheetName,int row,int column,String value) throws Exception
	 {
		 System.out.println("sheetname------"+sheetName);
		 System.out.println("row------"+row);
		 System.out.println("column------"+column);
		 System.out.println("value-------"+value);
		 wb.getSheet(sheetName).getRow(row).createCell(column).setCellValue(value);
		 
		 
		// wb.getSheet(sheetName).getRow(row).createCell(column).setCellValue("Training");
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\mahat\\eclipseNew\\SIMProject\\TestInputs\\Inputs.xlsx");
		 wb.write(fos);
		 
		 
	 }
	 //close
	 public void closeExcel() throws Exception
	 {
		 wb.close();
	 }
	 
	 public static void main(String[] args) throws Exception 
	 {
		 Utilities excel = new Utilities();
		 System.out.println("row count-----"+excel.rowCount("Sheet1"));
		 System.out.println("col count-----"+excel.colCount("Sheet1",0));
		 
		 for (int i = 0; i <=excel.rowCount("Sheet1"); i++) 
		 {
			 System.out.println("i value-----"+i);
			 for (int j = 0; j <excel.colCount("Sheet1", i); j++) 
			 {
				 System.out.println("j value ------"+j);
				 System.out.println(excel.getData("Sheet1", i, j));
				 //writing the data into Excel
				  excel.writeData("Sheet2", i, j, excel.getData("Sheet1", i, j));
				 
		     }			
			
	     }
		 excel.closeExcel();
		 
		/*
		 * Workbook wb = null;
		 * 
		 * wb.getSheet("Sheet1").getRow(3).createCell(2).setCellValue("vasudeva");
		 * FileOutputStream fos = new
		 * FileOutputStream("C:\\\\Users\\\\mahat\\\\Desktop\\\\TestData.xlsx");
		 * wb.write(fos); wb.close();
		 */
		/*
		 * File srcFile = new File("C:\\Users\\mahat\\Desktop\\writedata.xlsx");
		 * 
		 * FileInputStream fis = new FileInputStream(srcFile); XSSFWorkbook wb = new
		 * XSSFWorkbook(fis);
		 * 
		 * XSSFSheet ws = wb.getSheet("Sheet1");
		 * 
		 * ws.getRow(1).createCell(0).setCellValue("Vasudeva");
		 * ws.getRow(2).createCell(1).setCellValue("Training");
		 * 
		 * FileOutputStream fos = new FileOutputStream(srcFile); wb.write(fos);
		 * 
		 * wb.close();
		 */
		 
		 
		 
		 
		
		 
		
     }
	

}
