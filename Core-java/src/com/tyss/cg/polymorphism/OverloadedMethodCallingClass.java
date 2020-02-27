package com.tyss.cg.polymorphism;

public class OverloadedMethodCallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethodsClass overloadedMethodsClass = new OverloadedMethodsClass();

		System.out.println("add(int i,int j): " + overloadedMethodsClass.add(4, 5));
		System.out.println("add(int i,int j,int k): " + overloadedMethodsClass.add(4, 5, 6));
		System.out.println("add(int i,double j): " + overloadedMethodsClass.add(4, 50.43));
		System.out.println("add(double i,int j): " + overloadedMethodsClass.add(43.4, 5));
	}

}
