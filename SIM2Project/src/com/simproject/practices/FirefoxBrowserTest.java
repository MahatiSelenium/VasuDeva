package com.simproject.practices;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahat\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Gmail.com");

	}

}
