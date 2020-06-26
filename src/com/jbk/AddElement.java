package com.jbk;

import java.util.ArrayList;

public class AddElement {
	public static void main(String[] args) {
		ArrayList arrl= new ArrayList();
		arrl.add("FIRST");
		arrl.add("SECOND");
		arrl.add("THIRD");
		arrl.add("RANDOM");
		System.out.println("Before Actual ArrayList:"+arrl);
	ArrayList list=new ArrayList();
	list.add("ONE");
	list.add("TWO");
	list.add("LIST");
	arrl.addAll(list);
	System.out.println("\n After copy Arraylist: " +arrl);
	
	}

}
