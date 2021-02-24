package com.sim.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//capturing frames count
		//List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		//System.out.println(frames.size());
		//Give the control to a particular frame
		
		//Index
		
		//driver.switchTo().frame(0);
		
		//String
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		//WebElement
		
		WebElement fr=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		
		driver.switchTo().frame(fr);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).build().perform();
		
		//giving the control to previous html document
		driver.switchTo().defaultContent();
		
		//droppable
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
		

	}

}
