package com.tyss.cg.methods;

public class MethodCalligClass {
//	 static AreaCalculator a = new AreaCalculator(); if the object is created outside the main method then it should be declared as static


	public static void main(String[] args) {
		
		AreaCalculator a = new AreaCalculator();

		System.out.println("Area of Square: " +a.calculateAreaOfSquare(5));
		System.out.println("Area of Rectangle: " +a.calculateAreaOfRectangle(2,3));
		System.out.println("Area of Circle: " +a.calculateAreaOfCircle(10));
	}

}
