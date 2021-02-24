package com.sim.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/advanced_search");
		
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("xX4UFf")).sendKeys("VASUDEVA");
		
		//select text
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		
		//copy text
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		
		//paste text
		
		driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");*/
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//driver.findElement(By.id("NqEkZd")).sendKeys("PageDown");
		
		driver.findElement(By.xpath("//*[@id='s1zaZb']/div[5]/div[9]/div[2]/input[2]")).click();
		
		

	}

}
