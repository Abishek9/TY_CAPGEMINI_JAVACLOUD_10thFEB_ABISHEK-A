package com.tyss.cg.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		String string = "Some String";
		String str = "Malayalam";
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println(stringBuffer);

		System.out.println(stringBuffer.length());

		stringBuffer.append("Buffer");
		System.out.println(stringBuffer);

		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());

		stringBuffer.replace(5, 6, "s");
		System.out.println(stringBuffer);

		stringBuffer.insert(5, "ABC");
		System.out.println(stringBuffer);

		int index = stringBuffer.indexOf("xyz");
		System.out.println(index);
		int index1 = stringBuffer.indexOf("AB");
		System.out.println(index1);

		stringBuffer.delete(5, 8);
		System.out.println(stringBuffer);
	}

}
