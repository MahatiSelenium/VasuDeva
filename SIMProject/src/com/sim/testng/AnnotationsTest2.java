package com.sim.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2 
{

	@Test
	public void testMethod3()
	{
		System.out.println("TestMethod3 Executed");
	}
	@Test
	public void testMethod4()
	{
		System.out.println("TestMethod4 Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Executed");
	}
}
