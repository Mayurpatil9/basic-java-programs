package com.learning.opps.main;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); 
		list.add("mayur");
		list.add("Mhp");
		list.add("Raje2");
		list.add("Mhp");
		
		Iterator<String> itr=list.iterator();
		
		while (itr.hasNext()) {
			//Object object = (Object) itr.next();
			System.out.println(itr.next());			
		}

	}

}
