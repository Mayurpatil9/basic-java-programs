//Option 01:
/*
import java.util.Scanner;
class Swapping{
	public static void main(String [] args){
		Scanner x=new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1=x.nextInt();
		
		System.out.println("Enter Second number:");
		int number2=x.nextInt();
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("Swapped numbers are:"+number1+" "+number2);
	}

}
*/

//Option 02:

import java.util.Scanner;
class Swapping{
	public static void main(String [] args){
		Scanner x=new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1=x.nextInt();
		
		System.out.println("Enter Second number:");
		int number2=x.nextInt();
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("Swapped numbers are:"+number1+" "+number2);
	}

}