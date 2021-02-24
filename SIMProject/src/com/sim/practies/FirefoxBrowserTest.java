package com.sim.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vasu\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://Gmail.com");

	}

}
