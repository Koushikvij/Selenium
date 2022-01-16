package com.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scr.nextInt();
		if(number==0 || number==1)
		{
			System.out.println(number+" is not a prime number");
		}
		else if(number>1)
		{
			boolean flag=false;
			for (int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=true;
				}				
			}
			if(!flag)
				System.out.println(number+" is a prime number");			
			else
				System.out.println(number+" is not a prime number");
		}
	}
}
