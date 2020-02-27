package com.tyss.cg.classesandobject;

import com.tyss.cg.methods.ArithmeticOperation;

public class ObjectClassMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClassMethodExample ref = new ObjectClassMethodExample();
		ObjectClassMethodExample ref1 = new ObjectClassMethodExample();

		System.out.println(ref.getClass()); // to get fully qualified name // return type object
		System.out.println(ref.toString()); // address of the object
		System.out.println(ref.hashCode());
		System.out.println(ref); // address of the object

		System.out.println();

		System.out.println(ref1.getClass()); // to get fully qualified name
		System.out.println(ref1.toString()); // address of the object
		System.out.println(ref1.hashCode());
		System.out.println(ref1); // address of the object

		System.out.println();

		System.out.println(ref.equals(ref1)); // address of object is different
		
		
	}

}
