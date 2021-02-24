package com.sim.java;

public class Vasu 
{
	//variables
	int i=10;
		
	//methods
	
	public void add()
	{
		int a=20;
		
		int b=40;
		
		int sum=a+b;
		
		System.out.println(sum);

	}
	public static void main(String[] args)
	{
		// Object
		
		Vasu v=new Vasu();
		
		v.add();//method
		
		System.out.println(v.i); //variable
		
	}

}
