class EmployeeChild{
	int id;
	String name;
	float salary;
	
	void insert(int i,String n,float s){
		id=i;
		name=n;
		salary=s;
	}
	
	void display(){
	System.out.println(id+" "+name+" "+salary);	
	}
}

class Employee{
	public static void main(String []args){
		EmployeeChild e1=new EmployeeChild();
		EmployeeChild e2=new EmployeeChild();
		EmployeeChild e3=new EmployeeChild();
		
		e1.insert(1,"Mayur",50000);
		e2.insert(2,"Rahul",60000);
		e3.insert(3,"Rajveersing",80000);
		
		e1.display();
		e2.display();
		e3.display();
	}
}