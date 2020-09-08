package com.learning.opps.main;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector();
		
		v.add("Ayush");
		v.add("Garima");
		v.add("Ashish");
		
		Iterator<String> itr =v.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
