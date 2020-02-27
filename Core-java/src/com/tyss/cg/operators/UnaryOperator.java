package com.tyss.cg.operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		boolean b = true;

		System.out.println(-i);
		System.out.println(!b);

		System.out.println("Value of post-increment value is = " + i++); // Post-increment
		System.out.println("Value of i = " + i);

		System.out.println("Value of post-increment value is = " + ++j); // Pre-increment
		System.out.println("Value of j = " + j);

		System.out.println("Value of post-decrement value is = " + i--); // Post-decrement
		System.out.println("Value of i = " + i);

		System.out.println("Value of pre-decrement value is = " + --j); // Pre-decrement
		System.out.println("Value of j = " + j);

	}

}
