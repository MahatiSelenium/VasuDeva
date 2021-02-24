package com.sim.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BargavLiveProject\\BargavSel\\CommonJarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//htm alert
	
		driver.findElement(By.xpath("//*[@id='corover-close-btn']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		
		Thread.sleep(2000);
		
		//Java script Alert
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		Thread.sleep(2000);
		
		al.accept();//ok 
		
		//al.dismiss();//cancel
		
		//al.getText();//text
		
		//al.sendKeys("Vasu");//enter text
		

	}

}
