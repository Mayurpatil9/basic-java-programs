class HashCode{
	public static void main(String [] args){
		//Creating two instances of the Employee Class
		Employee emp1=new Employee(918,"Maria"); 
		Employee emp2=new Employee(918,"Maria"); 
		//Invoking hash code method
		int a=emp1.hashCode();
		int b=emp2.hashCode();
		System.out.println("Hashcode of employee 1"+a);
		System.out.println("Hashcode of employee 2"+b);
		
		System.out.println("Comparing objects of employee 1&employee 2"+emp1.equals(emp2));	
	}
}