package com.tyss.cg.assignment;

public class Thread2 extends Thread{
	public void run()
	{
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=11;i<21;i++)
		{
			System.out.println(i);
		}
	}

}
