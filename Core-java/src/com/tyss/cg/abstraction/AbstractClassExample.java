package com.tyss.cg.abstraction;

import com.tyss.cg.inheritance.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface{
	abstract String display();
	abstract String print();
	@Override
	public void printMessage() {
		System.out.println("AstractClassExample");
	}
	AbstractClassExample()
	{
		
	}
}
