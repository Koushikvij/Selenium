package com.programs;
import java.util.HashMap;
import java.util.Map;

public class ArrayFind {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int[] numberlist= {1,1,3,3,4,4,9,9,6};
		//int[] numberlist= {6,1,1,3,3,4,4,9,9};
		//int[] numberlist= {1,1,3,3,6,4,4,9,9};
		for(int i=0;i<=numberlist.length-1;i++)
		{
			hs.put(numberlist[i], hs.getOrDefault(numberlist[i], 0)+1);
		}
		for(int i=0;i<numberlist.length;i++)
		{
			int val=hs.get(numberlist[i]);
			if(val<2)
			{
				System.out.println(numberlist[i] + " is the unique number");
				break;
			}
		}		
	}
}
