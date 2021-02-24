package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropDownTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList = drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
			//select one by one from dropdow
			//dropList.get(i).click();
			
			//DropDown Validation
			dropList.get(i).click();
			if(dropList.get(i).isSelected())
			{
				System.out.println(dropList.get(i).getText() +"  is Selected");
			}else {
				System.out.println(dropList.get(i).getText() +"  is not Selected");
			}
			
			//select a specific item from dropdown
			if(dropList.get(i).getText().equals("Electronics"))
			{
				dropList.get(i).click();
			}
			
	
       }

	}

}
