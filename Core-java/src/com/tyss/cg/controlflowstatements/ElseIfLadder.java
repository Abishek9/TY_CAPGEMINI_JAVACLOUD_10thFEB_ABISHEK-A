package com.tyss.cg.controlflowstatements;

public class ElseIfLadder {

	public static void main(String[] args) {
		
		int number=3;
		
				if(number <31)
				{
					System.out.println("Not a teen number (number below 13)");
				}else if(number>=13 && number<19)
				{
					System.out.println("Teen number");
				}else
				{
					System.out.println("Not a teen number (number above 19)");
				}
		

	}

}
