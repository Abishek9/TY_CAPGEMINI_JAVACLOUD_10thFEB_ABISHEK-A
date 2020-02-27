package com.tyss.cg.exception;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		try {
			properties.load(new FileReader("application properties"));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in try");
			e.printStackTrace();
		}
		finally {
			System.out.println("code in finally block");
		}

	}

}
