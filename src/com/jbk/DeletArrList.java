package com.jbk;

import java.util.ArrayList;

public class DeletArrList {
	public static void main(String[] args) {
		ArrayList arrl= new ArrayList();
		arrl.add("FIRST");
		arrl.add("SECOND");
		arrl.add("THIRD");
		arrl.add("RANDOM");
		System.out.println(" Actual ArrayList:"+arrl);
		arrl.clear();
	System.out.println("\n After clear Arraylist: " +arrl);
	
	}

}
