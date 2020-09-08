package com.learning.opps.main;

import java.util.*;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Mayur");
		list.add("Rahul");
		list.add("Sangramsing");
		list.add("Mango");
		
		System.out.println(list);

		
		ArrayList<String>list1=new ArrayList<>();
		
		list1.add("Mayur");
		list1.add("Rahul");
		list1.add("Sangramsings");
		list1.add("Mango");
		
		System.out.println(list1);
		
		boolean x=list.equals(list1);
		System.out.println(x);
		
		list1.add("Banana");
		
		boolean y=list.equals(list1);
		System.out.println(y);
		
		//list1.removeAll(list);
		
		//System.out.println(list1);
		
		list1.retainAll(list);
		
		System.out.println("Common elements in both list are"+list1);
		
		ArrayList<String>list2=new ArrayList<>();
		
		for (String string : list) {
			list2.add(list1.contains(string)?"YES":"NO");
			System.out.println(list2);
		}
	}

}
