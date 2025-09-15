package com.practice.Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNumberInArray {
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=scan.nextInt();
	int[] array=new int[size];

	System.out.println("Enter the number of the array:");
for(int i=0;i<size;i++)
{
	array[i]=scan.nextInt();
}
	Arrays.sort(array);
	int largest=array[size-1];
	int position=0;
	for(int j=array.length-1;j>=0;j--)
	{
		if(largest==array[j])
		{
			largest=array[j];
			position=j;
		}
	}
	if(largest==array[0])
	{
		System.out.println("All Numbers are same..");
	}
	else
	{
	System.out.println("Second Largest Number is: "+array[position-1]);
	}
	scan.close();
	
}
}
