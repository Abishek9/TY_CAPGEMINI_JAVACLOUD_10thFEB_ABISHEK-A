package com.tyss.cg.polymorphism;

public class OverloadedMethodsClass {

	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}

	public double add(int i, double j) {
		return i + j;
	}

	public double add(double i, int j) {
		return i + j;
	}

}
