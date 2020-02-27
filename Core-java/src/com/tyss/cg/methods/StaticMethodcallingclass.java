package com.tyss.cg.methods;

public class StaticMethodcallingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = ArithmeticOperation.add(8, 9);
		System.out.println("sum is : " + sum);
		System.out.println("sub is : " + ArithmeticOperation.sub(8, 9));
		System.out.println("mul is : " + ArithmeticOperation.mul(9, 9));
		System.out.println("div is : " + ArithmeticOperation.div(9, 9));

	}

}
