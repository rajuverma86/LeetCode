package com.practice.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeZeroesBackword {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  size of the array:");
		int size=scan.nextInt();
		int [] array=new int[size];
		System.out.println("Enter elements of array:");
		int i=0;
		for( i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}

		int index=0;
		for(i=0;i<size;i++)
		{
			if(array[i]!=0)
			{
				array[index]=array[i];
						index++;
			}
		}
		while(index<size)
		{
			array[index]=0;
			index++;
		}

		System.out.println(Arrays.toString(array));
		scan.close();
	}

}
