package com.tyss.cg.exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) { 
			System.out.println("Exception caught in the code");
			System.exit(0);	//terminate the program
		}catch(Exception e) {
			System.err.println("catch (Exception e)");
		}
		finally {
			System.out.println("Code to be executed be there any exception or not");
		}
		System.out.println("Hello World");

	}

}
