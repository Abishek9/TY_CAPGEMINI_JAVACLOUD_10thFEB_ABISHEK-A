package com.tyss.cg.exception;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			int i = 10;
			int j = scanner.nextInt();
			if (j == 0) {
				System.out.println("Should not divide the number with zero");
			} else {
				System.out.println(i / j);
			}
			
		}
	}

}
