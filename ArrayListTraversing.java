
package com.learning.opps.main;

import java.util.*;

public class ArrayListTraversing {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
			list.add("Ravi");
			list.add("Vijay");
			list.add("Ravi");
			list.add("Ajay");
			
			System.out.println("Traversing list through list operator");
			
			ListIterator<String>list1=list.listIterator(list.size());
			
			while(list1.hasPrevious()){
				String str=list1.previous();
				System.out.println(str);
				
				
			}
		
			System.out.println("Traversing list through for loop");
			
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));				
			}
			
			System.out.println("Traversing list through for each loop");
			
			for (String x : list) {
				System.out.println(x);
			}
	}
}
