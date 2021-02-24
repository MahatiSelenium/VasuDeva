package com.simproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffCheckboxTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		//identifying the checkbox and clicking 
		WebElement check = driver.findElement(By.id("remember"));
		
		if(check.isSelected())
		{
			System.out.println(check.isSelected());
			check.click();
		}
		

	}

}
