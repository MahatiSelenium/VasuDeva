package com.simproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(signin).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\'nav-al-your-account\']/a[4]")).click();;

	}

}
