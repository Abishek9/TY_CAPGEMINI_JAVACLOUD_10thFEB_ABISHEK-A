package com.tyss.cg.inheritance;

public class SubclassL2 extends SubclassL1 {
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		super.i=12;
		System.out.println("Overridden display() in subClass2");
	}
     
	@Override
	public String print() {
		// TODO Auto-generated method stub
		System.out.println("Overridden print() of SuperClass in subClass2");
		return super.print();
	}

	public static void main(String[] args) {
		SubclassL2 ref4 = new SubclassL2();
		ref4.display();
		System.out.println(ref4.print());
		System.out.println("Integer i of superclass: " + ref4.i);
	}

}
