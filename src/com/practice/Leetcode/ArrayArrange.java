package com.practice.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrange {

	public static void main(String[] args) {
int[] a1=new int[5];
int[] a2=new int[5];
int j=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the numbers");
for(int i=0;i<a1.length;i++)
{
	a1[i]=s1.nextInt();
}
for(int i=0;i<a1.length;i++)
{
	if(a1[i]<0) {
System.out.println(	a1[i]);
	}
	else
	{
		a2[j]=a1[i];
		j++;
	}
	
	
}
for( j=0;j<a2.length;j++)
{
	if(a2[j]!=0) {
	System.out.println(a2[j]);
	}
}
Arrays.sort(a1);
for(int i=0;i<a1.length;i++)
{
	if(a1[i]!=0) {
	System.out.println(a1[i]);
	}
}
	

	}

}
