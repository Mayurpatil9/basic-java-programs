
class Student{
	int rollno;
	String name;
	
	void insetrecord(int r,String n){
		rollno=r;
		name=n;
	}
	
	void displayinformation(){
		System.out.println(rollno+" "+name);
	}
}

class TestStudent4{
	public static void main(String [] args){
	  Student s1=new Student();
	  Student s2=new Student();
	  
	  s1.insetrecord(100,"Mayur");
	  s2.insetrecord(200,"Rahul");
	  
	  s1.displayinformation();
	  s2.displayinformation();
	
	}
}