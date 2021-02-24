package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadiDropDownTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://shadi.com/");
		driver.manage().window().maximize();
		
		//Capture all the values from Month DropDown and select one by one
		
		WebElement monthDrop =  driver.findElement(By.id("dob_m"));
		
		List<WebElement> monthDropList = monthDrop.findElements(By.tagName("option"));
		
		System.out.println(monthDropList.size());
		
		for (WebElement element : monthDropList)
		{
			System.out.println(element.getText());
		
			//select one by one from dropdown
			element.click();
			
			// select specific item from dropdown
			/*
			 * if(element.getText().equals("Mar")) 
			 * {
			 *  element.click(); 
			 * }
			 */
			
			//DropDown Validation
			if(element.isSelected())
			{
				System.out.println(element.getText() + "    is selected");
			}else {
				
				System.out.println(element.getText() + "    is not selected");
			}
		}
		
		

	}

}
