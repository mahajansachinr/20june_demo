package com.jbk;

import java.util.ArrayList;

public class CopyElement {
	public static void main(String[] args) {
		ArrayList arrl = new ArrayList();
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Delhi");
		arrl.add("Nagpur");
		System.out.println(" Actual ArrayList:" + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("\nCreated Array content:");
		for (String str : strArr) {
			System.out.println(str);

		}
	}
}
