package com.programs;

import java.util.Scanner;

public class Factorial {
	static int prod=1;

	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scr.nextInt();
		if(number==0)
		{
			System.out.println(number+"!: 1");
		}
		else
		{
			System.out.println(number+"!:"+factorial(number));
		}
	}
	
	public static int factorial(int num)
	{		
		if(num-1>0)		
		{
			prod=num*factorial(num-1);	
		}
		return prod;
	}
}
