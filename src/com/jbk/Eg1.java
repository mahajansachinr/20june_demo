package com.jbk;

import java.util.Iterator;
import java.util.ArrayList;

public class Eg1 {
	
	
	
	public static void main(String[] args) {
	ArrayList arrl = new ArrayList();
	// adding elements to the end0
	arrl.add("Pune");
	arrl.add("Mumbai");
	arrl.add("Aurangabad");
	arrl.add("Nagpur");
	Iterator<String> itr = arrl.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next());
	} } }


