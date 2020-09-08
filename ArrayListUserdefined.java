package com.learning.opps.main;

import java.util.*;

public class ArrayListUserdefined {

	public static void main(String[] args) {
		Student s1=new Student(1, "mayur", 27);
		Student s2=new Student(2, "Rahul", 27);
		Student s3=new Student(3, "Sangramsing", 30);
		Student s4=new Student(4, "DADA", 58);
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> itr=al.iterator();
		
		
		while (itr.hasNext()) {
			//System.out.println(itr.next());
			Student st=(Student)itr.next();
			System.out.println(st.rollno   +"  "+st.name+"            "+st.age);			
		}
	}
}
