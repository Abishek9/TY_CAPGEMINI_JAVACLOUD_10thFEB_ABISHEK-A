package com.tyss.cg.assignment;

public class DirectRunCallThread extends Thread {
	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  DirectRunCallThread t1=new DirectRunCallThread();  
		  DirectRunCallThread t2=new DirectRunCallThread();  
		   
		  t1.run();  
		  t2.run();  
		 }  
 
} 
