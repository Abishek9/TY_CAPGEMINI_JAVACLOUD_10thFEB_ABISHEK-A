package com.tyss.cg.inheritance;

import com.tyss.cg.methods.ArithmeticOperation;

public class SomeArithmeticOperations extends ArithmeticOperation {
	
	// if we want to call other class default constructor with respect to argument or not with argument we need to us super(arg or nor arg)
	public SomeArithmeticOperations() {
//		super("A");	super statement need to write only once - it need to be in a first line of a program
		System.out.println("SomeArithmeticOperations");
	}

	public static void main(String[] args) {
		
		
		SomeArithmeticOperations ref1=new SomeArithmeticOperations();
		
		System.out.println("Add method of superclass: " +add(23,66));
		System.out.println("Sub method of superclass: " +sub(644,45));
		System.out.println("Mul method of superclass: " +mul(989,23));
		System.out.println("Div method of superclass: " +div(34,2));

	}

}
