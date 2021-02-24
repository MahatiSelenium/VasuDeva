package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahat\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//capturing frames count
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		
		//storing in webelement
		WebElement fr = driver.findElement(By.xpath("//*[@id=\'content\']/iframe"));
		driver.switchTo().frame(fr);
		
		WebElement drg = driver.findElement(By.id("draggable"));
		WebElement drp = driver.findElement(By.id("droppable"));
		
		Actions dAd = new Actions(driver);
		dAd.dragAndDrop(drg, drp).build().perform();
		
		//giving the control back to previous html document
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/h1")).getText());
		
		
		
		
		
		
		

	}

}
