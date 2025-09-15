package com.practice.Leetcode;

import java.util.Scanner;

public class StringAnalyzer {

	public static void main(String[] args) {
//Scanner scan=new Scanner(System.in);
//System.out.println("Enter any String...");
//String str=scan.nextLine();
//int digit=0;
//int letters=0;
//int spaces=0;
//int symbol=0;
//for(int i=0;i<str.length();i++)
//{
//	char ch=str.charAt(i);
//	if(Character.isLetter(ch))
//	{
//		letters++;
//	}
//	else if(Character.isDigit(ch))
//	{
//		digit++;
//	}
//	else if(Character.isWhitespace(ch))
//	{
//		spaces++;
//	}
//	else
//	{
//		symbol++;
//	}
//}
//System.out.println("Numbers "+digit+ " Letters "+letters+ " spaces "+spaces+ " symbols"+symbol);
//	}
//
//	@Override
//	public String toString() {
//		return "StringAnalyzer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String...");
		String string=scan.nextLine();
		int digit=0;
		int characters=0;
		int spaces=0;
		int symbols=0;
		for(int i=0;i<string.length();i++)
		{
			if(Character.isDigit(string.charAt(i)))
			{
				digit++;
			}
			else if(Character.isLetter(string.charAt(i)))
			{
				characters++;
			}
			else if(Character.isWhitespace(string.charAt(i)))
			{
				spaces++;
			}
			else
			{
				symbols++;
			}
		}
		System.out.println("Digits: "+digit+" Characters: "+characters+" Spaces: "+spaces+" Special Symbols: "+symbols);
	}
}
