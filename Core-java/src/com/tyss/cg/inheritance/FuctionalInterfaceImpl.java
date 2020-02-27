package com.tyss.cg.inheritance;

public class FuctionalInterfaceImpl implements FuctionalInterfaceExample,FunctionalInterfaceExample2 {

	@Override
	public void showMessage() {
		System.out.println("Overridden showMessage() of FunctionalInterfaceExample");
	}
	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
	
	public static void main(String[] ars) {
		FuctionalInterfaceImpl ref1=new FuctionalInterfaceImpl();
		ref1.showMessage();
		FuctionalInterfaceExample.printMessage();
		ref1.displayMessage();
		
		System.out.println(ref1.add(4, 5));
		ref1.messageDisplay();
		FunctionalInterfaceExample2.print();
	}
	

}
