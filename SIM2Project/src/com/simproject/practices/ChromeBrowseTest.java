package com.simproject.practices;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowseTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");

	}

}
