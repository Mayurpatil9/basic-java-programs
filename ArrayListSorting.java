package com.learning.opps.main;

import java.util.*;


public class ArrayListSorting {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		System.out.println("Before Sorting"+list1);
		
		Collections.sort(list1);
		
		for(String	fruit:list1){
			System.out.println(fruit);			
		}
		
		System.out.println("Sorting numbers in ascending order:");
		
		List<Integer>list2=new ArrayList<Integer>();
		
		list2.add(21);
		list2.add(11);
		list2.add(56);
		list2.add(33);
		list2.add(89);
		
		

		Collections.sort(list2);
		
		for(Integer	number:list2){
			System.out.println(number);			
		}
		
		System.out.println("Sorting numbers in Descending order:");
		
		Collections.sort(list2,Collections.reverseOrder());
		
		Iterator itr=list2.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}

}
