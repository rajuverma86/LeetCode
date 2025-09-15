package com.practice.Leetcode;

public class SearchElement {

	public static void main(String[] args) {
int arr1[]= {1,2,3,4,5};
int num=4;
for(int i=0;i<arr1.length;i++)
{
	if(num==arr1[i])
	{
		System.out.println("Element is present at position : " + i+1);
	}
	else
	{
		System.out.println("-1");
	}
}
	}

}
