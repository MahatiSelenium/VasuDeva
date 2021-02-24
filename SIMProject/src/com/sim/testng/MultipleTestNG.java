package com.sim.testng;

import org.testng.annotations.Test;

public class MultipleTestNG
{

 @Test(priority=1,enabled=false)
 public void appLaunch()
 {
	System.out.println("app Launch"); 
 }
 @Test(priority=2)
 public void appLogin()
 {
	System.out.println("app Login"); 
 }
 @Test()
 public void appLogout()
 {
	System.out.println("app Logout"); 
 }
 @Test()
 public void appClose()
 {
	 System.out.println("app Close");
 }
}
