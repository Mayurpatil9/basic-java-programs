class Account{
	int acc_no;
	String name;
	float amount;
	//Method to initialise object
	void insert(int a,String n,float amt){
		acc_no=a;
		name=n;
		amount=amt;	
	}
	//Method to deposite amt
	void deposit(float amt){
	amount=amount+amt;
	System.out.println("Amount Deposited"+amt);
	}
	
	//Withdraw method
	void withdraw(float amt){
		if(amount<amt){
			System.out.println("Insufficient Balance");		
		}
		else{
			amount=amount-amt;
			System.out.println("Amount withdrawn:"+amt);
		}	
	}
	//Method to check balance of account
	void checkBalance(){
		System.out.println("Balance is:"+amount);
	}
	
	//Method to displays values of an object
	void display(){
		System.out.println("Customer Account number:"+acc_no+"Customer name:"+name+"Principal Balance:"+amount);
	}	
}


class TestAccount{
	public static void main(String [] args){
		Account a1=new Account();
		a1.insert(123456,"Mayur Patil",100000);
		a1.display();
		a1.checkBalance();
		a1.deposit(10000);
		a1.checkBalance();
		a1.withdraw(25000);
		a1.checkBalance();
	}

}