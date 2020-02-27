package com.tyss.cg.exception;

import java.util.Scanner;

public class CustomExceptionTester {

	public static void main(String[] args) throws InvalidNumberCustomException {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number >= 0 && number <= 10) {
			System.out.println(number * 10);
		} else if(number>0) {
			throw new InvalidNumberCustomException("CustomException Message");

			
		}else
		{}

	}

}
