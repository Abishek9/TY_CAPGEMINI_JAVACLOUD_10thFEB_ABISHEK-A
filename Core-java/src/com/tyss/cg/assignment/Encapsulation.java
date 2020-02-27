package com.tyss.cg.assignment;

public class Encapsulation {
	private int i;
	private String str;
	
	public Encapsulation(int n,String str1) {
		this.i=n;
		this.str=str1;
		
//		System.out.println(i);
//		System.out.println(str);
	}
	public Encapsulation()
	{
		
	}
	@Override
	public String toString() {
		return "Encapsulation [ str=" + str + "]";
	}

//	public int getI() {
//		return i;
//	}
//
//	public void setI(int i) {
//		this.i = i;
//	}
//
//	public String getStr() {
//		return str;
//	}
//
//	public void setStr(String str) {
//		this.str = str;
//	}
//	
	

}
