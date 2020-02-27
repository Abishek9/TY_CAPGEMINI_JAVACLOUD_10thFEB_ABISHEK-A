package com.tyss.cg.methods;

public class ArithmeticOperation {
	public ArithmeticOperation(String str)
	{
		System.out.println("ArithmeticOperation constructor with arg");
	}
	
	public ArithmeticOperation()
	{
		System.out.println("ArithmeticOperation constructor..");
	}

	/**
	 * This method returns sum of two given integers,
	 * 
	 * @param i
	 * @param j
	 * @return int i + int j
	 */
	public static int add(int i, int j) // method signature
	{
//		int sum=i+j;				//there will be one return statement inside a single method
//		return sum;					// return statement will return the execution to calling method or main method 

		return i + j;
	}

	/**
	 * This method returns sum of two given integers,
	 * 
	 * @param i
	 * @param j
	 * @return int i - int j
	 */
	public static int sub(int i, int j) {

		return i - j;

	}

	/**
	 * This method returns sum of two given integers,
	 * 
	 * @param i
	 * @param j
	 * @return int i / int j
	 */
	public static double div(double i, double j) {

		return (i / j) * 1.0;
	}

	/**
	 * This method returns sum of two given integers,
	 * 
	 * @param i
	 * @param j
	 * @return int i * int j
	 */

	public static int mul(int i, int j) {

		return i * j;
	}

	public static void main(String[] args) {

		int sum = add(5, 6);
		System.out.println("sum is : " + sum);
		System.out.println("sum is :" + add(36, 45));
		System.out.println("sub is :" + sub(45, 45));
		System.out.println("div is :" + div(36, 5));
		System.out.println("mul is :" + mul(36, 45));

	}

}
