class Student{
	int id;
	String name;
	
	Student(int i,String n){
	id=i;
	name=n;	
	}
	
	Student(Student s){
	id=s.id;
	name=s.name;
	}
	
	void display(){
	System.out.println(id+" "+name);
	
	}
	class ConstructorCopy{
		public static void main(String []args){
		Student s1=new Student(1,"Mayur");
		Student s2=new Student(2,"Sangramsing");
		Student s3=new Student(3,"Rahul");
		
		s1.display();
		s2.display();
		s3.display();		
		}	
	}

}