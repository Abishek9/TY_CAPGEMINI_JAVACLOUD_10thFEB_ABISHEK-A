package com.tyss.cg.collections;

import java.util.Arrays;

public class ArraysClassExample1 {
	public static void main(String[] args) {
		int[] intArray= {1,4,6,3,5,7,2,9};
		Arrays.sort(intArray);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("---------------------------");
		
		int [] intArray2=Arrays.copyOf(intArray, 8);
		System.out.println("Length iof the array" + intArray2.length);
		System.out.println("---------------------------");
		
		for(int i=0;i<intArray2.length;i++) {
			System.out.println(intArray2[i]);
		}
		
		System.out.println("---------------------------");
		
//		Arrays.fill(intArray2, 8,9,120);
//		Arrays.fill(intArray2, 9,10,150); 
		
		
		for(int i=0;i<intArray2.length;i++) {
			System.out.println(intArray2[i]);
		}
		
		System.out.println("---------------------------");
		
		System.out.println(intArray.equals(intArray2));
		System.out.println(Arrays.equals(intArray,intArray2));
		
	}
}
