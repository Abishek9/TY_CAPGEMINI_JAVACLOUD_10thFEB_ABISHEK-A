package com.tyss.cg.controlflowstatements;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=2359;
		
		if(time >= 2300)
		{
			System.out.println("Include late night charges");
		}else
		{
			System.out.println("Exclude late night charges");
		}
		System.out.println("Pizza will be delivered");
	}

}
