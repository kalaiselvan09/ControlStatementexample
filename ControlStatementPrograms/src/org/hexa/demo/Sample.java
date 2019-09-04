package org.hexa.demo;

import java.util.Scanner;

public class Sample {
	
	
	public static void main(String[] args) {
		
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year::");
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("THe given year is leap year");
		}
		else
		{
			System.out.println("NOT LEAP");
		}
	
	}
	
}

