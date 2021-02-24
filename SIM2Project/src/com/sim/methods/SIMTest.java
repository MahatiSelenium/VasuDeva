package com.sim.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIMTest 
{
	
	ChromeDriver driver;
	String res;
	
	//App Launch
	public String appLaunch(String url) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		
		if(driver.findElement(By.id("username")).isDisplayed())
		{
			//System.out.println("Pass");
			res ="Pass";
		}else {
			res = "Fail";
		}
		
		return res;
		
	}
	
	//App Login
	
	public String appLogin(String userName, String password)
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
		
		if(driver.findElement(By.xpath("//*[@id=\'mi_dashboard_php\']/a")).isDisplayed())
		{
			res = "Pass";
		}else {
			res = "Fail";
		}
		return res;
	}
	//App Logout
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id=\'mi_logout\']/a")).click();
		if(driver.findElement(By.id("username")).isDisplayed())
		{
			//System.out.println("Pass");
			res ="Pass";
		}else {
			res = "Fail";
		}
		
		return res;
	}
	//App Close
	public void appClose()
	{
		driver.close();
	}
	
	public static void main(String[] args) throws Exception 
	{
		SIMTest simApp = new SIMTest();
		
		simApp.appLaunch("http://sim.qamerits.com/login.php");
		simApp.appLogin("admin", "master");
		simApp.appLogout();
		
		Thread.sleep(2000);
		simApp.appClose();
		
		
	}

}
