package com.tyss.cg.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ThrowsKeywordClassExample{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		properties.load(new FileReader("application.properties")); // creating a object and calling load method
		System.out.println(new Properties().getProperty("name"));
		System.out.println("Same code");
	}

}
