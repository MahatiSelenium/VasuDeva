package com.sim.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest
{

	
	@Test(dataProvider="getData")
	public void login(String username,String pwd)
	{
		System.out.println("Username is : "+username);
		System.out.println("Password is :"+pwd);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data [0][0]="Vasudeva";
		data [0][1]="Selenium";
		
		data [1][0]="Vasudeva1";
		data [1][1]="Selenium1";
		
		return data;
	}
}
