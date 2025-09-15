package com.practice.Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoNumbersSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number to find: ");
		int target=scan.nextInt();
		HashMap<Integer,Integer>  numbers=new HashMap<>();
		int index1=-1;
		int index2=-1;
		for(int i=0;i<size;i++)
		{
			int number=target-arr[i];
			if(numbers.containsKey(number))
			{
				index1=numbers.get(number);
				index2=i;
				break;
			}
			numbers.put(arr[i], i);
			
			
		}
		System.out.println("["+ index1+ " "+ index2 +"]");
		
	}

}
