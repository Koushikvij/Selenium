package com.programs;

public class NumberPrint {
	
	public static void main(String[] args)
	{
		int res=0;
		//System.out.println(1);
		for(int i=1;i<=15;i++)
		{
			System.out.println(res+1);
			res=i+i;
			i=res;
		}
	}

}
