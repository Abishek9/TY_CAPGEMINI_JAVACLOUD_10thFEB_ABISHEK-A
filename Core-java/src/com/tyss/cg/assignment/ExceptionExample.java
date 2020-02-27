package com.tyss.cg.assignment;

public class ExceptionExample {

	public static void main(String[] args) {
		String str = "";
		try {
			System.out.println(str.charAt(3));
			int a = 9 / 0;
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception Occured1");

		} catch (ArithmeticException e) {
			System.out.println("Exception Occured2");
		}

	}

}
