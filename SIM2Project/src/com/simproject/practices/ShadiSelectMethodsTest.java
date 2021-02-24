package com.simproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiSelectMethodsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://shadi.com/");
		driver.manage().window().maximize();
		
	/*
	 * Dropdown Selection Month, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select month = new Select(driver.findElement(By.id("dob_m")));
		month.selectByVisibleText("Mar");
		List<WebElement> ml = month.getOptions();
		System.out.println(ml.size());
		System.out.println(month.isMultiple());
		
		List<WebElement> mlitems = month.getAllSelectedOptions();
		
		for (WebElement element : mlitems)
		{
			System.out.println(element.getText());
			
		}
		
		
	/*
	 * Dropdown Selection Day, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select day = new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(20);
		List<WebElement> dl = day.getOptions();
		System.out.println(dl.size());
		System.out.println(day.isMultiple());
		
		List<WebElement> dlitems = day.getAllSelectedOptions();
		for (WebElement element1 : dlitems)
		{
			System.out.println(element1.getText());
			
		}
		
	/*
	 * Dropdown Selection Year, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select year = new Select(driver.findElement(By.id("dob_y")));
		year.selectByValue("1992");
		List<WebElement> yl = year.getOptions();
		System.out.println(yl.size());
		System.out.println(year.isMultiple());
		
		List<WebElement> ylitems = year.getAllSelectedOptions();
		for (WebElement element2 : ylitems)
		{
			System.out.println(element2.getText());
			
		}
		
	/*
	 * Dropdown Selection Religion, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select religion = new Select(driver.findElement(By.id("ddlReligion")));
		religion.selectByVisibleText("Hindu");
		List<WebElement> rl = religion.getOptions();
		System.out.println(rl.size());
		System.out.println(religion.isMultiple());
		
		List<WebElement> rlitems = religion.getAllSelectedOptions();
		for (WebElement element3 : rlitems)
		{
			System.out.println(element3.getText());
			
		}
		
	/*
	 * Dropdown Selection Education, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select edu = new Select(driver.findElement(By.id("ddlEducation")));
		edu.selectByIndex(3);
		List<WebElement> el = edu.getOptions();
		System.out.println(el.size());
		System.out.println(edu.isMultiple());
		
		List<WebElement> elitems = edu.getAllSelectedOptions();
		for (WebElement element4 : elitems)
		{
			System.out.println(element4.getText());
			
		}
		
	/*
	 * Dropdown Selection Country, getting size,and verifying if multiple is possible
	 * and if multiple selected get all the selected value names
	 */
		Select country = new Select(driver.findElement(By.id("ddlCountry")));
		country.selectByValue("113");
		List<WebElement> cl = country.getOptions();
		System.out.println(cl.size());
		System.out.println(country.isMultiple());
		
		List<WebElement> clitems = country.getAllSelectedOptions();
		for (WebElement element5 : clitems)
		{
			System.out.println(element5.getText());
			
		}

	}

}
