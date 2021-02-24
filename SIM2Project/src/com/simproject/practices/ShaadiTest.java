package com.simproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShaadiTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://shadi.com/");
		driver.manage().window().maximize();
		
		//login
		//driver.findElement(By.className("member_login")).click();
		driver.findElement(By.id("first_name")).sendKeys("sreya");
		driver.findElement(By.id("last_name")).sendKeys("Kolla");
		
		//Radio Buttons selection
		driver.findElement(By.id("rblGender_0")).click();
		driver.findElement(By.id("rblGender_1")).click();
		
		//Radio Buttons selection for looking
		driver.findElement(By.id("rblGender_1_for")).click();
		driver.findElement(By.id("rblGender_0_for")).click();
		
		// Dropdown Selection Month
		Select Month = new Select(driver.findElement(By.id("dob_m")));
		Month.selectByVisibleText("Mar");
		Month.selectByIndex(3);
		// Dropdown Selection Day
		Select Day = new Select(driver.findElement(By.id("dob_d")));
		Day.selectByVisibleText("20");
		Day.selectByIndex(20);
		// Dropdown Selection Year
		Select Year = new Select(driver.findElement(By.id("dob_y")));
		Year.selectByVisibleText("1995");
		Year.selectByIndex(9);
		
		// Dropdown Selection Religion
		Select Religion = new Select(driver.findElement(By.id("ddlReligion")));
		Religion.selectByVisibleText("Hindu");
		Religion.selectByIndex(2);
		
		// Dropdown Selection Education
		Select Edu = new Select(driver.findElement(By.id("ddlEducation")));
		Edu.selectByVisibleText("Masters");
		Edu.selectByIndex(3);
		
		// Dropdown Selection Country
		Select Country = new Select(driver.findElement(By.id("ddlCountry")));
		Country.selectByVisibleText("India");
		Country.selectByIndex(4);
		

	}

}
