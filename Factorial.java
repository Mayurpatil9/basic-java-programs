import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
	int i,fact=1;
	int number;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number:");
	number=x.nextInt();
	for(i=1;i<=number;i++){
		fact=fact*i;
	}
	System.out.println("Factorial of"+number+"is:"+fact);	
	}
}