package com.practice.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindBySubject {
	public static void main(String []args)
	{
		String[][] data=
			{
					{"raju","java"},
					{"daksh","java"},
					{"shubhi","python"},
					{"dev","python"},
					{"dalveer","java"}
			};
		
		HashMap<String,List<String>> map=new HashMap<>();
		for(String[] entry:data)
		{
			String student=entry[0];
			String subject=entry[1];
			map.computeIfAbsent(subject, k-> new ArrayList<>()).add(student);
		}
		
		map.forEach((k,v)->
		{
			System.out.println(k+" -> "+v);
		}
				);
	}

}
