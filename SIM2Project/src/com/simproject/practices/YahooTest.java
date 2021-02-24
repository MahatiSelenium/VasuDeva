package com.simproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://in.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("header-search-input")).sendKeys("Selenium");
		driver.findElement(By.id("header-desktop-search-button")).click();
		

	}

}
