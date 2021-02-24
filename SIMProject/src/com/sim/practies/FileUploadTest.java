package com.sim.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		//AutoIt
		
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\FileUpload.exe");
		
		//driver.findElement(By.id("wdgt-file-upload")).sendKeys("E:\\Models.docx");

	}

}
