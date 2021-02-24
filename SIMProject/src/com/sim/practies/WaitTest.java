package com.sim.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("vasu.584");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		
		//wait

	}

}
