package com.tyss.cg.assignment;

public class SubClass extends SuperClass {
	
	public void click()
	{
		System.out.println("SubClassMethod");
	}

	public static void main(String[] args) {
//		SuperClass s1=new SuperClass();
//		s1.test();
//		SubClass s2= new SubClass();
//		s2.click();
//		s2.test();
		
		SuperClass s1=new SubClass();
		s1.test();
		
		SubClass s2= (SubClass) s1;
		s2.test();
		s2.click();
		

	}

}
