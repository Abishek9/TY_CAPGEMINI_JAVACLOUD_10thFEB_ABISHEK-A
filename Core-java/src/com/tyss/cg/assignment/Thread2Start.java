package com.tyss.cg.assignment;

public class Thread2Start extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.err.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2Start ref= new Thread2Start();

		ref.start();
		ref.start();
}
}