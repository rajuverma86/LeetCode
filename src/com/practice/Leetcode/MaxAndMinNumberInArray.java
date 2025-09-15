package com.practice.Leetcode;

import java.util.Scanner;

public class MaxAndMinNumberInArray {
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the Numbers of Array:");
	for(int i=0;i<size;i++)
	{
		array[i]=scan.nextInt();
	}
	
	int max=array[0];
	int  small=array[0];
	for(int a=1;a<size;a++)
	{
if(array[a]>max)		
{
	max=array[a];
}
		
	}
	for(int j=0;j<array.length;j++)
	{
		if(array[j]<small)
		{
			small=array[j];
		}
	}
	System.out.println("Greatest Number is: "+max);
	System.out.println("Smallest Number is: "+small);
	
}
}
