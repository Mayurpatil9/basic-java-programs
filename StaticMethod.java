class Student{
	int rollno;
	String name;
	static String college="GCOEJ";
	
	static void change(){
	college="SSBT";
	}

	Student(int r,String n){
	rollno=r;
	name=n;	
	}
	
	void display(){
	System.out.println(rollno+" "+name+" "+college);
	}
}
