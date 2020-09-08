/**
 * 
 */
package com.learning.opps.main;

import java.util.*;

/**
 * @author Dell
 *
 */
public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		System.out.println("New Initial list of an array"+al);
		
		al.add("Mayur");
		al.add("Sangramsing");
		al.add("Lucky");
		al.add("Om");
		
		Iterator x=al.iterator();
		
		while (x.hasNext()) {
			System.out.println(x.next());
		}  
		
		System.out.println("After invoking add(E e) method"+al);
		al.add(2,"Ram");
		
		System.out.println("After invoking add(int index,e element) method"+al);
		
		ArrayList<String>al1=new ArrayList<>();
		al1.add("Rajveersing");
		al1.add("Ritvi");
		
		al.addAll(al1);
		System.out.println("After invoking addAll(Collection<?extends E>c)method:"+al);
		
		ArrayList<String>al2=new ArrayList<>();
		al2.add("Jayveersing");
		al2.add("Sai");
		
		al.addAll(2,al2);
		
		System.out.println("After invoking addAll(int index,Collection<?extends E>c) method"+al);
		
		
		//Remove methods are as follows:
		
		al.remove("Ram"); 													 //Removing specific element from arraylist  
		System.out.println("After invoking remove(object) method"+al);
		
		al.remove(1);														 //Removing element on the basis of specific position  
		System.out.println("After invoking remove(index) method"+al);
		
		al.removeAll(al2);													 //Removing all the new elements from arraylist 
		System.out.println("After invoking removeAll() method"+al);
		

		al.removeIf(str->str.contains("Rajveersing"));						//Removing elements on the basis of specified condition  Here, we are using Lambda expression  
		System.out.println("After invoking removeIf() method"+al);
		
		al.clear();															//removing all the elements by using Clear()  
		System.out.println("After invoking clear():"+al);
	}

}
