package com.practice.Leetcode;

public class Palindrome {

	public static void main(String[] args) {
int num=23483;
int number=num;
int rev=0;
while(number>0)
{
int div=number%10;
rev=rev*10+div;
number=number/10;
	
}
System.out.println(rev);
	}

}
