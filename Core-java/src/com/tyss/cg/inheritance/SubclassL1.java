package com.tyss.cg.inheritance;

public class SubclassL1 extends SuperClass {
	
	@Override				
	public String print()
	{
		return "some other String";
	}
	
	public void display()
	{
		System.out.println("display() of subclassL1");
	}
	
	public static void main(String[] args) {
		SuperClass ref=new SuperClass();
		SubclassL1 ref1=new SubclassL1();
		SuperClass ref3=new SubclassL1();  //upcasting
		
		SubclassL1 ref2= (SubclassL1) ref3; //downcasting
		System.out.println(ref.print());
		System.out.println(ref1.print());
		System.out.println(ref2.print());
		ref1.display();
		
	}

}
