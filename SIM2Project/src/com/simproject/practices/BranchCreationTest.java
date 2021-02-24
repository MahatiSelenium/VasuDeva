package com.simproject.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		//branch creation
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("Madhapur");
		driver.findElement(By.id("txtAdd1")).sendKeys("Kukatpalli");
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		
		Thread.sleep(2000);
		Select state = new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		
		Thread.sleep(2000);
		Select city = new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		String msg=al.getText();
		al.accept();
		//validation
		
		if(msg.contains("created successfully"))
		{
			System.out.println("Pass");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("Fail");
		}else if(msg.contains("Please fill"))
		{
			System.out.println("Warning");
		}
		
		Thread.sleep(2000);
		//clicking Home button
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(2000);
		//Logout
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
