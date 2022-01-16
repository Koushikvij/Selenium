package com.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of elements to print:");
		int maxnum=scr.nextInt();
		if(maxnum<2)
		{
			System.out.println("Cannot print Fibonacci series for less than 2 elements");
		}
		else
		{
			int counter=2;
			int a,b,c;
			a=0;
			b=1;
			System.out.println("Fibonacci Series with maximum number of elements as "+maxnum+" is as follows:");
			System.out.println(a);
			System.out.println(b);
			while(counter<maxnum)
			{
				c=a+b;
				a=b;
				b=c;			
				System.out.println(c);
				counter++;
			}
		}
	
	}
}
