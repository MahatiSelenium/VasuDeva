package com.sim.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Google.com");
		//maximize window
		driver.manage().window().maximize();
		
		
		List<WebElement> list=driver.findElements(By.xpath("//a[@class='gb_g']"));
		
		System.out.println(list.size());
		
		for (WebElement element : list)
		{
			System.out.println(element.getText());
		}
		

	}

}
