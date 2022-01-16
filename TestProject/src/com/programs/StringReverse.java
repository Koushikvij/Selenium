package com.programs;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scr.nextLine();
		String resultString="";
		char[] string=str.toCharArray();
		for(int i=string.length-1;i>=0;i--)
		{
			resultString+=string[i];
		}
		System.out.println("The Reverse of the string is "+resultString);
		if(str.toLowerCase().equals(resultString.toLowerCase()))
		{
			System.out.println(str+" is a palindrome");	
		}
		else
		{
			System.out.println(str+" is NOT a palindrome");
		}
	}

}
