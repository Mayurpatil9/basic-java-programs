package com.learning.opps.main;

import java.util.*;

public class ArrayListEmpty {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		
		System.out.println("Is ArrayList is empty:"+al.isEmpty());
		
		al.add("Myaur");
		al.add("Sangramsing");
		al.add("Rahul");
		
		System.out.println("After insertion size is:"+al.size());
		System.out.println("Is ArrayList is empty:"+al.isEmpty());
	}
}
