package com.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first number:");
			int a=Integer.parseInt(br.readLine().toString());
			System.out.println("Enter the second number:");
			int b=Integer.parseInt(br.readLine().toString());
			System.out.println("Enter the third number:");
			int c=Integer.parseInt(br.readLine().toString());
			if(a>b) 
			{
				if(a>c)
				{
					System.out.println(a+" is the greatest number");
				}
			}
			else if(b>c)
			{
				System.out.println(b+" is the greatest number");				
			}
			else
			{
				System.out.println(c+" is the greatest number");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
