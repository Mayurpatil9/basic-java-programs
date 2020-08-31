class Account{
	String name;
	int acc_no;
	float amount;
	void insert(String n,int a,float amt){
	   name=n;
	   acc_no=a;
	   amount=amt;	
	}
	
	void deposite(float amt){
		amount=amount+amt;
		System.out.println("Amount Deposited"+amt);
	}
	
	void withdrawn(float amt){
		if(amount<amt){
			System.out.println("Insufficient Balance");
		}
		else{
			amount=amount-amt;
			System.out.println("Amount withdrawn:"+amt);
		}	
	}
	
	void checkbalance(){
		System.out.println("Balance"+amount);
	}
	

	
	void display(){
		System.out.println("Customer name:"+name+"     Customer Account number:"+acc_no+    "Principal Balance:"+amount);
	}
}	

class  TestAccount1{
	public static void main(String [] args){
		Account a1=new Account();
		a1.insert("Mayur H.Patil",12345,100000);
		a1.display();
		a1.deposite(20000);
		a1.checkbalance();
		a1.withdrawn(40000);
		a1.checkbalance();
		a1.withdrawn(240000);	
	}
}