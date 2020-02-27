package com.tyss.cg.looping;

public class PresentationClass1 {

	public static void main(String[] args) {
		// Non-Static functions calling 
		// System.out.println(Presentationclass.a);
		// Presentationclass.a();
		
		// Static functions calling
		Presentationclass n1=new Presentationclass();
		System.out.println(n1.a1);
		n1.a2();

	}

}
