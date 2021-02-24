package com.sim.methods;

public class ReusingNS {

	public static void main(String[] args) 
	{
		NStaticMethodsTest ns = new NStaticMethodsTest();
		ns.adding();
		
		//calling static method
		
		int res = StaticMethodTest.add(20, 20);
		System.out.println(res);
		

	}

}
