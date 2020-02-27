package com.tyss.cg.assignment;

public class Sleep1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleep1 ref= new Sleep1();
		Sleep1 ref1= new Sleep1();
		ref.start();
		ref1.start();
}
}