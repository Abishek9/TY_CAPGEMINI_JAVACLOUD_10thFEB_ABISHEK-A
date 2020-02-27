package com.tyss.cg.looping;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i*18);
			i++; // if this increment is not given then there will be infinite loop
		}
		
		while(true)
		{
			System.out.println("Hello World"); //no statement after infinite while loop
		}

	}

}
