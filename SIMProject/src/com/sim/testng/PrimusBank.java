package com.sim.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBank
{

	ChromeDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("Http://PrimusBank.qedgetech.com");
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterTest
	public void appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
}
