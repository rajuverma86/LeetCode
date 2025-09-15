package com.practice.Leetcode;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String ..");
	String str=scan.nextLine();
String rev=new StringBuilder(str).reverse().toString();
System.out.println("Your Reversed String is: "+rev);
	scan.close();
	}

}
