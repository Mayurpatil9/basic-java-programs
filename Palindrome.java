import java.util.Scanner;
class Palindrome{
	public static void main(String[]args){
		int number,i,temp,remainder,sum=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number");
		number=x.nextInt();
		temp=number;
		while(number>0){
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;		
		}	
		if(temp==sum){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	}
}