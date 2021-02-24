package com.sim.practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BranchCreationTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//implict wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		
		WebDriverWait myWait=new WebDriverWait(driver, 10);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
				
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sample");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt ; i++) 
		{
			String bName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("Reading "+i+" Set of Data :"+bName+"---"+add1);
			
			//calling branchCreation
			
			
			myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")));
			
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			
			
			driver.findElement(By.id("BtnNewBR")).click();
			
			driver.findElement(By.id("txtbName")).sendKeys(bName);
			
			driver.findElement(By.id("txtAdd1")).sendKeys(add1);
			
			driver.findElement(By.id("txtZip")).sendKeys("55555");
			
			Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
			country.selectByIndex(1);
			
			Select state=new Select(driver.findElement(By.id("lst_stateI")));
			state.selectByIndex(1);
			
			Select city=new Select(driver.findElement(By.id("lst_cityI")));
			
			city.selectByIndex(1);
			
			
			driver.findElement(By.id("btn_insert")).click();
			
			
			Alert al=driver.switchTo().alert();
			
			String msg=al.getText();
			
			al.accept();
			
			//validation
			
			if(msg.contains("created Sucessfully"))
			{
				//System.out.println("Pass");
				ws.getRow(i).createCell(2).setCellValue("Pass");
			}else
				if(msg.contains("already Exist"))
				{
					//System.out.println("Fail");
					ws.getRow(i).createCell(2).setCellValue("Fail");
				}else
					if(msg.contains("Please fill"))
					{
						//System.out.println("Warning");
						ws.getRow(i).createCell(2).setCellValue("Warning");
					}
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			
					
							
			
		}

		wb.close();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		driver.close();
		
		}

}
