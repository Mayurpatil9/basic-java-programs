package com.learning.opps.main;

import java.util.*;

public class Dequeue1 {

	public static void main(String[] args) {
		Deque<String> x=new ArrayDeque<String>();
		
		x.add("Mayur");
		x.add("Sangramsing");
		x.add("Rajveersing");
		
		Iterator itr=x.iterator();
		
	//	while (itr.hasNext()) {
	//		System.out.println(itr.next());			
	//	}
		
		for (String str : x) {
			System.out.println(str);
		}
	}

}
