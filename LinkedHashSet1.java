package com.learning.opps.main;

import java.util.*;



public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> x=new LinkedHashSet<String>();
		
		x.add("1");
		x.add("2");
		x.add("3");
		x.add("17");
		x.add("4");
		x.add("17");
		
		Iterator<String> itr=x.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
