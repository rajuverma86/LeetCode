package com.practice.Leetcode;

import java.util.Scanner;

public class RotateAnArrayByKSteps {
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array...");
	int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("Enter elements of array...");
	for(int i=0;i<size;i++)
	{
		array[i]=scan.nextInt(); 
	}
	System.out.println("Enter the number from you want to rotate array");
	int number=scan.nextInt();
	for(int i=number;i<size;i++)
	{
		System.out.println(array[i]);
	}
	for(int i=0;i<number;i++)                                  
	{
		System.out.println(array[i]);
	}
	scan.close(); 
}
}
