package com.jbk;
import java.util.ArrayList;
public class ArrayListOperation {
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
	System.out.println(al);
	System.out.println("Element at index 1: "+al.get(1));
	System.out.println("Does List contains JAVA? :"+al.contains("JAVA"));
	al.add(2, "PLAY");
	System.out.println(al);
	System.out.println("Is Array List Empty ?" +al.isEmpty());
System.out.println("Index of PERL is : "+al.indexOf("PERL"));
	System.out.println("Size of ArryList is :"+al.size());
	
	
	}	
}
