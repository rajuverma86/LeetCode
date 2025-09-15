package com.practice.Leetcode;

import java.util.Scanner;

public class FindMajorityNumberInArray {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		int candidate=0;int count=0;
		
		for(int num:arr)
		{
			if(count==0)
			{
				candidate=num;
			}
			if(candidate==num)
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count>=size/2)
			{
				System.out.println("Majority element is "+candidate);

			}
			
		}
		
	}

}
