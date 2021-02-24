package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadioButtonsTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		//identifying the radio Buttons
		for(int k =1;k<=2;k++)
		{
		WebElement table= driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radioList = table.findElements(By.name("group"+k));
		
		System.out.println(radioList.size());
		
		for (int i = 0; i < radioList.size(); i++) 
		{
			System.out.println(radioList.get(i).getAttribute("value")+ "------" + radioList.get(i).getAttribute("checked"));
			
		}

		}

	}

}
