package com.tyss.cg.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;

			// AND Logical operator
		System.out.println(i > j && j > k);
		System.out.println(i > k && j < k);
		System.out.println(i < k && j > k);
		System.out.println(i < k && j < k);

		System.out.println("----------------------------");

			// OR Logical Operator
		System.out.println(i > j || j > k);
		System.out.println(i > k || j < k);
		System.out.println(i < k || j > k);
		System.out.println(i < k || j < k);
		
		System.out.println("----------------------------");
			// Not Logical operator
		System.out.println(i > j ^ j > k);
		System.out.println(i > k ^ j < k);
		System.out.println(i < k ^ j > k);
		System.out.println(i < k ^ j < k);

	}

}
