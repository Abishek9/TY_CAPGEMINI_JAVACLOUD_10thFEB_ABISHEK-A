package com.tyss.cg.collections;

import java.util.Arrays;

public class ArraysClassExample {

	public static void main(String[] args) {
		int[] intArray= {40,20,10,70,50,60,30,80,90,100};
		Arrays.sort(intArray);
//		int temp=0;
//		for(int j=0;j<intArray.length;j++)
//		{
//			for(int i=0;i<intArray.length-1-i;i++)
//			{
//				if(intArray[i]<intArray[i+1])
//				{
//					temp=intArray[i];
//					intArray[i]=intArray[i+1];
//					intArray[i+1]=temp;
//				}
//			}	
//		}
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
	}

}
