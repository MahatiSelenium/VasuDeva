package com.sim.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		//Identifying the header section
		
		//WebElement header=driver.findElement(By.id("nav-xshop"));
		
		//find all the links under the header section
		
		//List<WebElement> headerLinks=header.findElements(By.tagName("a"));

		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(headerLinks.size());
		
		for(WebElement element:headerLinks)
		{
			System.out.println(element.getText());
			
			/*if(element.getText().equals("Mobiles"))
			{
				element.click();
			}*/
		}
		
		
	}

}
