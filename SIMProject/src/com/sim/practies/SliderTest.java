package com.sim.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement sl=driver.findElement(By.xpath("//*[@id='slider']/span"));

		
		Actions slider=new Actions(driver);
		
		slider.clickAndHold(sl).moveByOffset(200,0).release(sl).build().perform();
		
		Thread.sleep(2000);
		
		slider.clickAndHold(sl).moveByOffset(-200,0).release(sl).build().perform();
	}

}
