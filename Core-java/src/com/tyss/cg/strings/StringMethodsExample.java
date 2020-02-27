package com.tyss.cg.strings;

public class StringMethodsExample {
	public static void main(String[] args) {

		String string1 = "Some String";
						//012345678910
		String string2 = "";
		String string3 = "sOmE sTrInG";

		int length = string1.length();
		// System.out.println(length);
		System.out.println("Length of string1:" + string1.length());
		System.out.println("isEmpty() of String: " + string1.isEmpty());
		System.out.println("isEmpty() of String: " + string2.isEmpty());

		System.out.println(string1.charAt(7));
		System.out.println(string1.charAt(string1.length() - 1));
		// System.out.println(string2.charAt(7)); Array index out of bound Exception

		System.out.println("equals() of String: " + string1.equals(string3));
		System.out.println("equalsIgnoreCase() of String: " + string1.equalsIgnoreCase(string3));

		String string4 = string1.concat(" concatenated string");
		System.out.println(string1);
		System.out.println(string4);

		String string5 = string1.replace('S', 's');
		System.out.println("replace() string" + string5);

		String string6 = String.valueOf(12345);
		System.out.println(string6);
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());

		System.out.println(string1.substring(5));
		System.out.println(string1.substring(5, 9));
		
		System.out.println("startsWith(String prefix) of String: "+string1.startsWith("o"));
		System.out.println("endsWith(String suffix) of String: "+string1.endsWith("l"));
		
		System.out.println(string1);
		
		
		
		
	}
}
