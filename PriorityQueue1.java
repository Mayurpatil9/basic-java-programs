package com.learning.opps.main;

import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String>x=new PriorityQueue<String>();
		x.add("1");
		x.add("3");
		x.add("6");
		x.add("2");
		x.add("5");
		x.add("4");//Sequence not clear.... 
		
		//System.out.println("Head"+x.element());
		//System.out.println("Head"+x.peek());
		System.out.println("Output using foreach loop : "+ x.size());
		int size = x.size();
		for (int i=0; i< size; i++) {
			System.out.println(x.poll());
		}
		
		System.out.println("Iterating the queue elements");
		
		Iterator itr=x.iterator();
		
		
		while (itr.hasNext()) {
			System.out.println("==>> "+itr.next());			
		}

		x.remove();
		x.poll();
		
		System.out.println("After removing two elements:");
		
		Iterator itr2=x.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());			
		}
	}

}
