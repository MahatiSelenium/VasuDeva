package com.sim.methods;

public class StaticMethodTest 
{

	
	//1. Static method with return-type with parameters
	
	public static int add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		//While calling static method no need to create an object
		
		//syntax:
		
		//className.methodname
		
		
		int res=StaticMethodTest.add(20, 20);
		
		System.out.println(res);
		
	}
}
