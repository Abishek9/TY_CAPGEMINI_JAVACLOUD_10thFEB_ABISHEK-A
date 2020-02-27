package com.tyss.cg.classesandobject;

public class ClassExample {
	// Zero-argument Constructor
	public ClassExample() {
		System.out.println("Zero-Argument Constructor...");
	}
	
	// Parameterized Constructor; Constructor Overloading
	public ClassExample(String string){
		System.out.println("Costructor with one string argument...");
		
	}
	
	//Parameterized Constructor
	public ClassExample(String string,int n1)
	{
		System.out.println("Constructor with one string and one int argumrnt...");
	}
	
	//Parameterized Constructor
		public ClassExample(int n1,String string)
		{
			System.out.println("Constructor with one int and one String argumrnt...");
		}
		public static void main(String[] args) {
			ClassExample ref=new ClassExample();
			ClassExample ref1=new ClassExample("Abi");
			ClassExample ref2=new ClassExample("Abi",18);
			ClassExample ref3=new ClassExample(18,"Abi");
		}

}
