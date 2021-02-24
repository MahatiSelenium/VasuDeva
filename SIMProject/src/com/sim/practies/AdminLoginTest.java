package com.sim.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest
{

	public static void main(String[] args)
	{
		//String username;
		//username="admin";
		String username="admin";
		
		String password="master";
		
		//AppLaunch
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://sim.qamerits.com/login.php");
		driver.manage().window().maximize();
		
		//validation
		if(driver.findElement(By.id("username")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		
		//AppLogin
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).sendKeys(Keys.ENTER);
		
		//AppLogout
		
		driver.findElement(By.id("logout")).click();
		
		
		//AppClose
		
		driver.close();
		
		
		

	}

}
