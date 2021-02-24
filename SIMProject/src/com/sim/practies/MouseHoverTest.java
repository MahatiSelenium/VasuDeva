package com.sim.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement sigIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions  mouse=new Actions(driver);
		
		mouse.moveToElement(sigIn).build().perform();
		
		//click on your wish list
		mouse.moveToElement(driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"))).click().build().perform();
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span")).click();

	}

}
