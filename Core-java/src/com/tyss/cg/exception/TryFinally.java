package com.tyss.cg.exception;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ahja");
		}
		finally {
			System.out.println("sdhkjsxh");
		}
		System.out.println("sjxj");
		System.out.println("Hello");
	}

}
