package com.learning.opps.main;

import java.util.*;

public class ArrayListBook {

	public static void main(String[] args) {
		ArrayList<Book>list=new ArrayList<>();
		
		Book b1=new Book(1,"Shivaji","Mayur","Nirali",20);
		Book b2=new Book(2,"Chhava","Lucky","Prakash",10);
		Book b3=new Book(3,"Shyamchi Aai","Sane Guruji","Navnnet",80);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);

		
		for (Book b : list) {
			System.out.println(b.id+" "+b.name+"       "+b.author+"   "+b.publisher+"    "+b.quantity);
		}
	}

}
