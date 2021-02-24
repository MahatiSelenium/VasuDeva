package com.sim.java;

public class StringValidationTest {

	public static void main(String[] args) 
	{
		
		/*String data="Selenium";
		
		String data1="Selenium";
		
		//validation
		
		if(data.equals(data1))
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		
		String data="Selenium Training";
		
		String data1="vasudeva";
		
		if(data.contains(data1))
		{
			System.out.println("exist");
		}else
		{
			System.out.println("not exist");
		}

	}

}
