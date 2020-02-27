package com.tyss.cg.looping;

public class ForLoop {

	public static void main(String[] args) {
//		int  i=0;
//
//		for (int j = 0; j < 10; j++) {
//			System.out.println(j * 13);
//		}
//
//		for (int j = 0; true; j++) { // Program will run continously
//			System.out.println(j * 13); // There should be no printing statement after infinite loop
//		}
		
		for(int j=0;j<10;j++)
		{
			System.out.println((j+1)*12);
		}
		
		System.out.println("*************************");
		int j=0;
		for(;j<10;j++)
		{
			System.out.println((j+1)*12);
		}
		
		System.out.println("*************************");
		int k=0;
		for(;k<10;)
		{
			System.out.println((k+1)*12);
			k++;
		}
	}
}