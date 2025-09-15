package com.practice.Leetcode;

import java.util.HashMap;

class NewHashMapWorking {
	int roll;
	String name;
	public NewHashMapWorking(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		
	}
	@Override
	public int hashCode()
	{
		return roll;
	}
	@Override
	public boolean equals(Object o)
	{
		if(this==o) return true;
		if(!(o instanceof NewHashMapWorking)) return false;
		NewHashMapWorking h=(NewHashMapWorking)o;
		return this.roll==h.roll;
	}
 }
 public class HashMapWorking{
public static void main(String []args)
{
	
HashMap<NewHashMapWorking,String > map=new HashMap<>();
map.put(new NewHashMapWorking(1,"Raju"),"java");
map.put(new NewHashMapWorking(1,"Dev"), "python");
System.out.println(map.size());
	

}
}
