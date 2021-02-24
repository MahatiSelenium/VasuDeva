package com.sim.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args)
	{
		
		/*//Initialize arryList
		//ArrayList<String> l=new ArrayList<>();
		List<String> l=new ArrayList<>();
		
		//Adding values into arrayList
		
		l.add("Selenium");
		l.add("Training");
		l.add("Vasu");
		l.add("New Item");
		l.add("Selenium");
		
		
		System.out.println(l.size());
		
		//Retrieving values from an arrayList
		
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		for(String item:l)
		{
			System.out.println(item);
		}*/
		
		/*List<Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(20);
		
		for (Integer item : l)
		{
			System.out.println(item);
		}
		*/
		
		List<Object> l=new ArrayList<>();
		
		l.add("Selenium");
		l.add(12);
		l.add(12.45);
		l.add('A');
		
		for (Object item : l)
		{
			System.out.println(item);
		}
		
		

	}

}
