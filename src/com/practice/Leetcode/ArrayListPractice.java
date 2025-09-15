package com.practice.Leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main (String []args)
	{
		ArrayList<String> name=new ArrayList<>();
		name.add("Raju");
		name.add("Daksh");
		name.add("Dalveer");
		name.add("Harshu");
		Iterator it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
