package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class GetSubList {
	public static void main(String[] args) {
		ArrayList arrl = new ArrayList();
		arrl.add("Zero");
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Fourth");
		arrl.add("Fifth");
		arrl.add("Sixth");
		System.out.println(" Actual ArrayList:" + arrl);
		List list = arrl.subList(0, 4);
		System.out.println("\n Sub List: " + list);
	}
}