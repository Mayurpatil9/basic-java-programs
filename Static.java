class Student{
	int rollno;
	String name;
	static String college="GCOEJ";
	
	Student(int r,String n){
		rollno=r;
		name=n;	
	}
	
	
	void display(){
		System.out.println(rollno+" "+name+" "+college);	
	}
}

public class Static {
	public static void main(String []args){
	Student s1=new Student(1,"Rajveersing");
	Student s2=new Student(2,"Rajput");
	
	s1.display();
	s2.display();
	}
}