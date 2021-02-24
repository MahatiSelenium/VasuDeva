package com.sim.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchCreationTest extends PrimusBank
{

	@Test(dataProvider="getData")
	public void branchCreation(String bName,String add1) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtbName")).sendKeys(bName);
		
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		
		city.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		
		al.accept();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data [0][0]="Address123";
		data [0][1]="Selenium";
		data [1][0]="Vasudeva1";
		data [1][1]="Selenium1";
		
		return data;
	}
}
