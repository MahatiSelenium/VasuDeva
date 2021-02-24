package com.sim.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTest {

	
		// TODO Auto-generated method stub
		public String baseUrl = "http://amazon.com";
		 public WebDriver driver;
		
		 @BeforeTest
		 public void baseUrl()
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				 driver = new ChromeDriver();
				 driver.get(baseUrl);
			}
		 
		 
		 @Test
		 
		 public void verifyHomePageTitle()
			{
				String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, expectedTitle);
			}
		 
		 @AfterTest
		 public void close()
		 {
			 driver.close();
		 }
		 
		
		
		
		
		
		
}
		
		
		
		

	


