package com.tyss.cg.abstraction;

public class TesterClass extends AbstractClassExample {

	@Override
	public void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("displayMessage() of MeethodsIterface");
	}

	@Override
	String display() {
		// TODO Auto-generated method stub
		return "display() of AstractClassExample";
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return "print() of AstractClassExample";
	}
	@Override
	public void printMessage() {
		System.out.println("AstractClassExample1");
	}
	public static void main(String[] args) {
		TesterClass testerClass= new TesterClass();
		testerClass.displayMessage();
		System.out.println(testerClass.print());
		System.out.println(testerClass.display());
		
		testerClass.printMessage();
	} 

}
