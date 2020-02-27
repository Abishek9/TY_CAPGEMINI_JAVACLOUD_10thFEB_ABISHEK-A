package com.tyss.cg.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "";
		try {
			//int i = 10 / 0;
			System.out.println(string.charAt(3));
		}
//		} catch (StringIndexOutOfBoundsException e) {
//			System.err.println("charAt(int index) should not be called on null String");
//			System.out.println(e.getCause());
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
//		} catch (ArithmeticException e) {
//			System.out.println("Should not divide by zero");
//			System.out.println(e.getCause());
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
//
//		} 
		catch (Exception e) {
			System.out.println("Exception caught in the code...");
//			System.out.println(e.getClass());
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());
		}
			System.out.println("Hello World");
	}

}
