package com.practice.Leetcode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String [] args)
	{
//		System.out.println(" Welcome ");
//		Scanner scan=new Scanner(System.in);
//		
//		//Initialize LocalTime
//		LocalTime now=LocalTime.now();
//		int hours=now.getHour();
//		if(hours>4 && hours<12)
//		{
//			System.out.println("Good Morning...");
//		}
//		
//		if(hours>12 && hours<17)
//		{
//			System.out.println("Good AfterNoon...");	
//		}
//		if(hours>16 && hours<21)
//		{
//			System.out.println("Good Evening...");
//		}
//		if(hours>16 && hours<4)
//		{
//			System.out.println("Good Night...");
//		}
//		System.out.println("Enter your name");
//		String name=scan.nextLine();
//		String rev="";
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			rev+=name.charAt(i);
//		}
//		System.out.println(rev);
//		System.out.println("Enter the year of birth :");
//		int year=scan.nextInt();
//		System.out.println("Enter the month of birth :");
//		int month=scan.nextInt();
//		System.out.println("Enter the day of birth :");
//		int day=scan.nextInt();
//		//initialize date 
//		LocalDate birthDate=LocalDate.of(year, month, day);
//		LocalDate today=LocalDate.now();
//
//		//time period
//		Period age=Period.between(birthDate, today);
//		System.out.println("Your age is : "+age.getYears());
//		scan.close();
//	}
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Welcome "+name);
		LocalTime now =LocalTime.now();
		int hours=now.getHour();
		if(hours>3 && hours<12)
			{
			System.out.println("Good Morning");
			
		}
		else if(hours>12 && hours<16)
		{
			System.out.println("Good AfterNoon..");
		}
		else if(hours>16 && hours<20)
		{
			System.out.println("Good Evening");
		}
		else
		{
			System.out.println("Good Night");
		}
		System.out.println("Enter year of birth");
		int year=scan.nextInt();
		System.out.println("Enter month of the birth");
		int month=scan.nextInt();
		System.out.println("Enter the date of birth");
		int date=scan.nextInt();
		LocalDate birthdate=LocalDate.of(year, month, month);
		LocalDate today=LocalDate.now();
		Period age=Period.between(birthdate, today);
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev+=name.charAt(i);
			
		}
		
		System.out.println("Dear "+rev+" Your age is: "+age.getYears());
	}
}
 