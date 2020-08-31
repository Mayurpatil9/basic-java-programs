class TestStudent1{
	public static void main(String [] args){
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.id=100;
		s1.name="Mayur ";
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s2.id=200;
		s2.name="Rahul";
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		s3.id=300;
		s3.name="Rajveersing";
		System.out.println(s3.id);
		System.out.println(s3.name);
	}
}

class Student{
	int id;
	String name;
	
	void insertRecord(int r,String n){
	rollno=r;
	name=n;	
	}
}