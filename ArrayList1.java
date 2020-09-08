
package com.learning.opps.main;

import java.util.*;

public class ArrayList1{
	public static void main(String [] args){
		ArrayList<String>list=new ArrayList<String>();
		list.add("Mayur");
		list.add("Sangramsing");		
		
		Iterator<String> x=list.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		
	}
	
}
