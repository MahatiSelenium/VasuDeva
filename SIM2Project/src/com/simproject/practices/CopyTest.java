package com.simproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahat\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		/*
		 * driver.findElement(By.id("xX4UFf")).sendKeys("Mahati");
		 * 
		 * //select text 
		 * driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		 * 
		 * //copy text 
		 * driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		 * 
		 * //paste text 
		 * driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
		 */
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//driver.findElement(By.id("NqEkZd")).sendKeys("Pagedown");
		
		//click on advanced search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div[5]/div[9]/div[2]/input[2]")).click();;
		
		

	}

}
