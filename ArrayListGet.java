package com.learning.opps.main;

import java.util.*;

public class ArrayListGet {

	public static void main(String[] args) {
	 ArrayList<String> x=new ArrayList();
	   
	 x.add("Mayur");
	 x.add("Snagramsing");
	 x.add("4");
	 x.add("3");
	 
	 System.out.println("Returning elements:"+x.get(1));
	 
	 x.set(2, "Dates");
	 
	 
	 	for (String fruit: x) {
	 		System.out.println(fruit);
	 	}
	}
}
