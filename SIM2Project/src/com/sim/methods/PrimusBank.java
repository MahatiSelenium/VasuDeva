package com.sim.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank {
	
	String res;
	ChromeDriver driver;
	//AppLaunch
	public String appLaunch(String url) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Pass");
			res ="Pass";
		}else {
			res = "Fail";
		}
		
		return res;
		
	}
	
	//AppLogin
	
	public String appLogin(String userName, String password) 
	{
		driver.findElement(By.id("txtuId")).sendKeys(userName);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		
		//validation
		if(driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			res ="Pass";
		}else {
			
			res ="Fail";
		}
		
		return res;
		
		
	}
	
	//Branch Creation
	public String branchCreation(String bName, String add1) throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtbName")).sendKeys(bName);
		
		Thread.sleep(2000);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		Thread.sleep(2000);
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		
		Thread.sleep(2000);
		Select state = new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		
		Thread.sleep(2000);
		Select city = new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		String msg=al.getText();
		al.accept();
		//validation
		
		if(msg.contains("created successfully"))
		{
			//System.out.println("Pass");
			res ="Pass";
		}else if(msg.contains("already Exist"))
		{
			//System.out.println("Fail");
			res="Fail";
		}else if(msg.contains("Please fill"))
		{
			//System.out.println("Warning");
			res = "Warning";
		}
		
		Thread.sleep(2000);
		//clicking Home button
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(2000);
		
		return res;
	}
	
	//App Logout
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Pass");
			res ="Pass";
		}else {
			res = "Fail";
		}
		
		return res;
		
	}
	
	public void appClose() {
		driver.close();
	}

	public static void main(String[] args) throws Exception 
	{
		PrimusBank app = new PrimusBank();
		String results =app.appLaunch("http://primusbank.qedgetech.com/");
		System.out.println(results);
		
		String loginRes= app.appLogin("Admin", "Admin");
		System.out.println(loginRes);
		
		String bCreationRes = app.branchCreation("Madhapur", "Kukatpalli");
		System.out.println("branch creation------"+bCreationRes);
		
		String logoutRes = app.appLogout();
		System.out.println(logoutRes);
		
		app.appClose();
		
	}

}
