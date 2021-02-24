package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelectMethodsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		//Practice Testing all the select Methods
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		Select  sl = new Select(drop);
		
		List<WebElement> dropList = sl.getOptions();
		
		//getting the size of dropdown and all options from the dropdown
		System.out.println(dropList.size());
		
		for (WebElement element : dropList) 
		{
			System.out.println(element.getText());
		}
		
		// to get the selected value Name of what ever is selected from dropdown
		sl.selectByIndex(24);
		System.out.println(sl.getFirstSelectedOption().getText() + "  is selected");
		
		//To verify if it is possible to select multiple values from the dropdown
		System.out.println(sl.isMultiple());
		
		//If multiple is selected , to get all the selected values
		List<WebElement> slitems =sl.getAllSelectedOptions();
		
		System.out.println(slitems.size());
		for (WebElement element1 : slitems)
		{
			System.out.println(element1.getText());
			
		}
		
		

	}

}
