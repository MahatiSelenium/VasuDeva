package com.sim.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class KeywordTest 
{

	
		static String xlpath="C:\\Users\\vasu\\Downloads\\Keywords.xlsx";
		static int tccount,tscount;
		static String tcexe,tcid,tstcid,keyword,res;
		
		@Test
		public void keywordprg() throws Exception
		{
			Library app=new Library();
			
			
			FileInputStream fi=new FileInputStream(xlpath);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet ws1=wb.getSheet("TestCases");
			XSSFSheet ws2=wb.getSheet("TestSteps");
			tccount=ws1.getLastRowNum();
			tscount=ws2.getLastRowNum();
			
			
			
			for (int i = 1; i <=tccount; i++)// testcase sheet
			{
				tcexe=ws1.getRow(i).getCell(2).getStringCellValue();//y
				
				if(tcexe.equalsIgnoreCase("y"))//y=y
				{
					
					tcid=ws1.getRow(i).getCell(0).getStringCellValue();// tc001
					
					for (int j = 1; j <=tscount; j++)//test steps
					{
						tstcid=ws2.getRow(j).getCell(0).getStringCellValue();//tc001
						
						if (tstcid.equalsIgnoreCase(tcid))//tc001=tc001
						{
							keyword=ws2.getRow(j).getCell(4).getStringCellValue();//LaunchApp
							
							
							switch (keyword) 
							{
							case "LaunchApp":
								res=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
								break;
							case "Login":
								
								res=app.appLogin("Admin","Qedge123!@#");
								break;
							
							case "EmpReg":
								
								res=app.empReg("Selenium678","Selenium897");
								break;
							case "Logout":
								res=app.appLogout();
								break;
							

							}
							
							//result updation  in teststeps sheet
							
							ws2.getRow(j).createCell(3).setCellValue(res);
							
							//result updation in testcase sheet
							if (!ws2.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("fail"))
							{
								ws1.getRow(i).createCell(3).setCellValue(res);
							}
							else
							{
								ws1.getRow(i).createCell(3).setCellValue("fail");
							}
							
						}
						
						
					}
				}
					
					else 
					{
						ws1.getRow(i).createCell(3).setCellValue("Blocked");
					}
					
				
				
			}
			FileOutputStream fo=new FileOutputStream(xlpath);
			wb.write(fo);
			
			wb.close();
			
			
		}



}
