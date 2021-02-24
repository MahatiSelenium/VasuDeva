package com.sim.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities
{

	Workbook wb;
	
	//it will load the excel sheet
	public Utilities() throws Exception
	{
		
		FileInputStream fis=new FileInputStream("D:\\VasuSelMA\\SIMProject\\TestInputs\\InputSheet.xlsx");
		wb=WorkbookFactory.create(fis);
	}
	
	public int rowCount(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum();
	}
	
	public int colCount(String sheetname,int row)
	{
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	
	
	public String getData(String sheetname,int row,int column)
	{
		
		String data="";
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==CellType.NUMERIC)
		{
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data=String.valueOf(celldata);
		}else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		
		return data;
	}
	
	//Store data into excel Sheet
	
	public void setData(String sheetname,int row,int column,String status) throws Exception
	{
		Sheet sh=wb.getSheet(sheetname);
		
		Row rownum=sh.getRow(row);
		
		Cell cell=rownum.createCell(column);
		
		cell.setCellValue(status);
		
		
		
		FileOutputStream fos=new FileOutputStream("D:\\VasuSelMA\\SIMProject\\TestOutPut\\OutputSheet.xlsx");
		wb.write(fos);
		
		fos.close();
	}
		
	
	public static void main(String[] args) throws Exception
	{
		Utilities excel=new Utilities();
		
		excel.setData("Sheet1", 1, 2, "VasuDeva");
	}
	
}
