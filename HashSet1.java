package com.learning.opps.main;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> x=new HashSet<>(); 
		
		x.add("1");
		x.add("3");
		x.add("1");
		x.add("4");
		x.add("2");
		
		Iterator itr=x.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
