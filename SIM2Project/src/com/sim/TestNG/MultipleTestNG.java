package com.sim.TestNG;

import org.testng.annotations.Test;

public class MultipleTestNG 
{
	@Test
	public void appLaunch()
	{
		System.out.println("app launch");
	}
	@Test
	public void appLogin()
	{
		System.out.println("app Login");
	}
	@Test
	public void appLogout()
	{
		System.out.println("app Logout");
	}
	@Test
	public void appClose()
	{
		System.out.println("app Close");
	}

}
