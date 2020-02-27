package com.tyss.cg.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		int result=(i>j) ? (i+j) : (i-j);  // Ternary Operator
		System.out.println("Result is " + result);
		System.out.println((i>j) ? (i+j) : (i-j)); // Ternary Operator
	}
	

}
