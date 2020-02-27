package com.tyss.cg.inheritance;

import com.tyss.cg.methods.ArithmeticOperation;

public class DifferentPackageMethodExample extends ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentPackageMethodExample ref1=new DifferentPackageMethodExample();
		System.out.println(ref1.toString());
		System.out.println(ref1.hashCode());
		
		System.out.println(add(2, 3));
		System.out.println(sub(9,2));
		System.out.println(mul(9,9));
		System.out.println(div(36,4));
	

	}

}
