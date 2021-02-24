package com.sim.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1 
{
	
	@Test
	public void testMethod1()
	{
		System.out.println("TestMethod1 Executed");
	}
	@Test
	public void testMethod2()
	{
		System.out.println("TestMethod2 Executed");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod Executed");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod Executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass Executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass Executed");
	}
	

}
