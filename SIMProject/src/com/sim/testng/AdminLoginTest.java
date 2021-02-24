package com.sim.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AdminLoginTest 
{

	@Test
	public void adminLogin()
	{
		String username="admin";
		
		String password="master";
		
		//AppLaunch
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://sim.qamerits.com/login.php");
		driver.manage().window().maximize();
		
		// Validation
		
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
		
		
		
	}
}
