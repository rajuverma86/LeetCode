package com.practice.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the first String...");
String first=s1.nextLine();
System.out.println("Enter the second String...");
String second=s1.nextLine();
char[] firstArr=first.replaceAll("\\s","").toLowerCase().toCharArray();
char[] secondArr=second.replaceAll("\\s","").toLowerCase().toCharArray();
Arrays.sort(firstArr);
Arrays.sort(secondArr);
if(Arrays.equals(firstArr, secondArr))
{
	System.out.println("Anagram String");
}
else
{
	System.out.println("Not a Anagram String");

}
}


}
