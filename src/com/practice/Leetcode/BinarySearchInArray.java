package com.practice.Leetcode;

import java.util.Scanner;

public class BinarySearchInArray {
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the Array...");
	int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the number of array..");
	for(int j=0;j<size;j++)
	{
		array[j]=scan.nextInt();
	}
	System.out.println("Enter the number to search..");
	int number=scan.nextInt();
	int count=0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]==number)
		{
			int position=i+1;
			System.out.println("Number Found at Position: "+position );
			count++;
		}
		
	}
	if(count==0)
	{
		System.out.println("Number Not Found");
	}
	
}
}
