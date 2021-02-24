package com.sim.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		//identify the dropdown
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		//Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		Select sl=new Select(drop);
		
		//sl.selectByIndex(23);
		
		//sl.selectByVisibleText("Music");
		
		//sl.selectByValue("search-alias=amazon-devices");
		
		//List<WebElement> dropList=sl.getOptions();
		
		//System.out.println(dropList.size());
		
		//for (WebElement element : dropList) 
		//{
		//	System.out.println(element.getText());
		//}
		
		//sl.selectByIndex(23);
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		
		//System.out.println(sl.isMultiple());
		
		
		sl.selectByIndex(23);
		//sl.selectByIndex(25);
		
		List<WebElement> slitem=sl.getAllSelectedOptions();
		
		System.out.println(slitem.size());
		
		for (WebElement element : slitem) 
		{
			System.out.println(element.getText());
		}
		
		
		
		
		
		
	}

}
