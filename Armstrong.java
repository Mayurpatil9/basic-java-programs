import java.util.Scanner;
class Armstrong{
	public static void main(String []args){
		int number,remainder,temp,sum=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=x.nextInt();
		temp=number;
	while(number>0){
		remainder=number%10;
		sum=sum+(remainder*remainder*remainder);
		number=number/10;	
	}	
		if(temp==sum){
			System.out.println("The number is Palindrome");
		}
		else{
			System.out.println("The number is not Palindrome");
		}
	}

}