package com.practice.Leetcode;

import java.util.HashMap;

public class WordCounter {
	public static void main(String []args)
	{
		String text="spring boot spring java hashmap java advance boot boot";
		HashMap<String,Integer> freq=new HashMap<>();
		for(String word:text.split(" "))
		{
			freq.put(word,freq.getOrDefault(word, 0)+1);
		}
		freq.forEach((k,v)->
		{
			System.out.println(k+" -> "+v);
		}
				);
		
		
		
	}

}
