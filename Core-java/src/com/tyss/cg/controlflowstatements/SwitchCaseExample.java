package com.tyss.cg.controlflowstatements;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		String day = "Friday";     

		switch (day) {
		case "Monday":
			System.out.println("Weekday");

			break;
		case "Tuesday":
			System.out.println("Weekday");

			break;
		case "Wednesday":
			System.out.println("Weekday");

			break;
		case "Thursday":
			System.out.println("Weekday");

			break;
		case "Friday":
			System.out.println("Weekday");

			break;
		case "Saturday":
			System.out.println("Weekend");

			break;
		case "Sunday":
			System.out.println("Weekend");

			break;

		default: System.out.println("Invalid day");
			break;
		}

	}

}
