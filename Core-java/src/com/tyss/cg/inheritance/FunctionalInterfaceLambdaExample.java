package com.tyss.cg.inheritance;

public class FunctionalInterfaceLambdaExample {
	static String string="Lambda Expression Example";
	static FuctionalInterfaceExample functionalInterfaceExample= 
			() -> System.out.println(string);
	
			static FunctionalInterfaceExample2 functionalInterfaceExample1= 
					(i,j) -> i+j;		
			
			public static void main(String[] args) {
				functionalInterfaceExample.displayMessage();
				functionalInterfaceExample.showMessage();
				
				FuctionalInterfaceExample.printMessage();
				
				System.out.println(functionalInterfaceExample1.add(5, 6));
				functionalInterfaceExample1.messageDisplay();
				FunctionalInterfaceExample2.print();
				
				
				
			}
}
