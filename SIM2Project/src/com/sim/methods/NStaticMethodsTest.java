package com.sim.methods;

public class NStaticMethodsTest 
{
	
	
	public int add(int a,int b)
	
	{
		int sum = a+b;
		return sum;
	}
	
	public int add()
	{
		int a =10;
		int b = 20;
		int sum = a+b;
		
		return sum;
	}
	
	public void adding(int a,int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}
	
	public void adding()
	{
		int a =20;
		int b = 30;
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	{
		
		NStaticMethodsTest ns = new NStaticMethodsTest();
		//ns.add(10, 10);
		
		/*
		 * int res = ns.add(15, 20); 
		 * System.out.println(res);
		 */
		int res =ns.add();
		System.out.println(res);
		
		ns.adding(30, 40);
		ns.adding();
	
		
	}
	
}
