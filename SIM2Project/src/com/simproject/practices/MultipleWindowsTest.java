package com.simproject.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//clicking on recruiters
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		/*
		 * for (String child : windows) { //capture the window id
		 * System.out.println(child);
		 * 
		 * //give control to one by one window
		 * 
		 * driver.switchTo().window(child); System.out.println(driver.getTitle());
		 * 
		 * if(!driver.getTitle().equals("LNT")) { driver.close(); }
		 * 
		 * }
		 */
		
		List<String> tabs = new ArrayList(windows); 
		
		System.out.println("tabs------"+tabs.size());
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("index-----"+ tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
