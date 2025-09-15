package com.practice.Leetcode;
import java.util.Arrays;
public class InterSectionOfTwoArrays {
	public static void main(String []args)
	{
		int[] arr1= {10,20,20,30,20,20,20,30,30,40,70,90};
		int[] arr2= {20,20,20,20,30,40,30,70,60,50};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int lastprinted=0; 
	int i=0;int j=0;
	while(i<arr1.length && j<arr2.length)
	{                  
		if(arr1[i]==arr2[j] )
		{
			if(lastprinted!=arr1[i])
			{
			System.out.println(arr1[i]);
			 lastprinted=arr1[i];
			}
			i++;
			j++;
		}
		else if(arr1[i]<arr2[j])
		{
			i++;
		}
		else
		{
			j++;
		}
	}
	}

}
