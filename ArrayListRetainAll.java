package com.learning.opps.main;

import java.util.*;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		
		al.add("mayur");
		al.add("Sangramsing");
		al.add("Rajveersing");
		
		System.out.println("After invoking frist array list:"+al);
		
		
		ArrayList<String>al1=new ArrayList<>();
		
		al1.add("mayur");
		al1.add("Shubham");
		al1.add("Rajveersing");
		
		System.out.println("After invoking second array list:"+al1);

		
		al.retainAll(al1);
		
		System.out.println("After invoking RetainAll method:"+al);	
		
		al1.retainAll(al);
		
		System.out.println("After invoking RetainAll method2:"+al1);	
	}
}
