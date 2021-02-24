package com.sim.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Google.co.in");
		driver.manage().window().maximize();
		
		//capture all the links 
		
		List<WebElement>  links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//capture the name of all links
		
		for (int i = 0; i < links.size(); i++)
		{
			//System.out.println(links.get(i).getText());
			
			//Click on Specific Links
			
			/*if(links.get(i).getText().equals("Gmail"))
			{
				links.get(i).click();
			}*/
			
			//System.out.println(links.get(i).getText());
			
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
		}

	}

}
