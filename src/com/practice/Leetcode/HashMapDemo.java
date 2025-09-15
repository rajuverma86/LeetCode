package com.practice.Leetcode;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String []args)
	{
		HashMap<Integer,String > map=new HashMap<>();
		map.put(1, "Raju");
		map.put(2,"Daksh");
		map.put(3,"Shubhi");
		map.put(3, "harshu");

//	for(Integer key:map.keySet())
//	{
//		System.out.println(key +" -> "+map.get(key));
//	}
		
//		for(var entry:map.entrySet())
//		{
//			System.out.println(entry);
//		}
map.forEach((k,v)->
{
	System.out.println(k+" -> "+v);
}
);
		
	}
}
