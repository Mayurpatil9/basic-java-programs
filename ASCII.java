import java.util.Scanner;
class ASCII{
	public static void main(String []args){
		char ch1;
		int ch2='b';
		
		
		//int asciivalue2=ch2;
		System.out.println("Enter a character");
		Scanner x=new Scanner(System.in);
		ch1=x.next().charAt(0);
		int asciivalue1=ch1;
		
		
		System.out.println("The ASCII value of "+ch1+"is"+asciivalue1);
		System.out.println("The ASCII value of b"+ch2);
	
	}

}