package com.tyss.cg.looping;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

//		int sum = 0;
//		for (int i = 2; i <= 50; i = i + 2) {
//			sum = sum + i;
//		}
//		System.out.println("Sum of even number from 1 to 50 is " + sum);
//
//		int a = 5;
//		int b = 5;
//		int c = 1;
//		for (int i = 1; i <= b; i++)
//
//		{
//			c = c * a;
//		}
//
//		System.out.println("Power value is " + c);
//
//		System.out.println("Fibonacci Series");
//
//		int x = 0;
//		int y = 1;
//		int n = 10;
//		int z = 0;
//
//		System.out.println(x);
//		System.out.println(y);
//		for (int i = 1; i <= n - 2; i++) {
//			z = x + y;
//			System.out.println(z);
//			x = y;
//			y = z;
//
//		}

		System.out.println("H.C.F of 2 numbers are");
		System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int counter;
		int hcf=0;
		for(int i=2;i<n1||i<n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
			 hcf=i;
			}
			
		}
		System.out.println(hcf);
		

		sc.close();

	}

}
