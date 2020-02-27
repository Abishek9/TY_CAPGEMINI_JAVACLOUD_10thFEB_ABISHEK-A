package com.tyss.cg.operators;

public class CharaterIncrement {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'a';
		System.out.println(ch1 + 1); // ASCII VALUE A=65
		System.out.println(ch2++);

		System.out.println(ch2 + 1); // ASCII VALUE a=98
		System.out.println(ch2++);

		System.out.println(ch1 - 1); // ASCII VALUE A=65
		System.out.println(ch2++);

		System.out.println(ch2 - 1); // ASCII VALUE a=98
		System.out.println(ch2++);

		System.out.println(ch1--); // ASCII VALUE a=98
		System.out.println(ch1);

	}

}
