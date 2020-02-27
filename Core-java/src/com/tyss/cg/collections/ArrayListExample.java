package com.tyss.cg.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		ArrayList<Integer> arrayList=new ArrayList<Integer>(10);
		arrayList.add(12); 
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(21);
		arrayList.add(40);
		arrayList.add(67);
		arrayList.add(null);
		arrayList.add(97);
		arrayList.add(23);
		arrayList.add(90);

		System.out.println("Size of ArrayList: " + arrayList.size());
		System.out.println("---------------------------------");

		for (Integer i : arrayList) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("---------------------------------");
		System.out.println(arrayList);
		System.out.println("---------------------------------");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println();
		System.out.println("---------------------------------");

		arrayList.remove(4);
		System.out.println();
		System.out.println("Size of ArrayList after removing: " + arrayList.size());

		
		
		System.out.println("---------------------------------");
		System.out.println(arrayList);
		System.out.println("---------------------------------");
		
		boolean isThere1=arrayList.contains(23);
		boolean isThere2=arrayList.contains(null);
		System.out.println("Output of Arraylist.contains(23): "+ isThere1);
		System.out.println("Output of Arraylist.contains(null): "+ isThere2);

	}

}
