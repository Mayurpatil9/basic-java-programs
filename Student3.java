class Student3{
	int id;
	String name;
	int age;
	
	Student3(){
	
	}
	
	Student3(int i,String n){
	id=i;
	name=n;	
	}
	
	Student3(int i,String n,int a){
	id=i;
	name=n;	
	age=a;
	}
	
	
	void display(){
	System.out.println(id+" "+name+" "+age);	
	}
	
	public static void main(String [] args){
		Student3 s1=new Student3(1,"Mayur");
		Student3 s2=new Student3(2,"Sangramsing",35);
		Student3 s3=new Student3();
		s1.display();
		s2.display();
		s3.display();
	}
}