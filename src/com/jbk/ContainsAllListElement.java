package com.jbk;

import java.util.ArrayList;

public class ContainsAllListElement {
	public static void main(String[] args) {
		ArrayList arrl = new ArrayList();
		arrl.add("FIRST");
		arrl.add("SECOND");
		arrl.add("THIRD");
		arrl.add("RANDOM");
		ArrayList list = new ArrayList();
		list.add("Second");
		list.add("Random");
		System.out.println(" Does ArrayList contains all List Element:" + arrl.containsAll(list));
list.add("one");
System.out.println(" Does ArrayList contains all List Element:" + arrl.containsAll(list));
	}
}
