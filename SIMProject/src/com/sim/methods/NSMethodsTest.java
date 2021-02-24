package com.sim.methods;

public class NSMethodsTest 
{

	//1. Method with return-type with parameters
	
	
	/*public int add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}*/
	
	//2. Method with return-type with-out parameters
	
	/*public int add()
	{
		int a=20;
		int b=20;
		int sum=a+b;
		
		return sum;
	}*/
	
	//3. Method with-out return-type with parameters
	
	/*public void add(int a,int b)
	{
		int sum=a+b;
		
		System.out.println(sum);
	}*/
	
	//4. Method with-out return-type with-out parameters
	
	public void add()
	{
		int a=5;
		int b=5;
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		NSMethodsTest ns=new NSMethodsTest();
		
		//ns.add(20, 20); //calling a method with methodname  , it won't return a value
		
		/*int res=ns.add(15, 15);//calling a method with variable,it will return a value
		System.out.println(res);*/
		
		//int res=ns.add();
		//System.out.println(res);
		
		//ns.add(50, 50);
		ns.add();
	}
	
}
