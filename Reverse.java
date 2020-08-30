import java.util.Scanner;

class Reverse{
	public static void main(String [] args){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=x.nextInt();
	int temp=number;
	int sum=0;
	/*while(number>0){
		int remainder =number%10;
		sum=sum*10+remainder;
		number=number/10;		
	}
		if(sum==temp){
			System.out.println("The number is Pallindrome");
		}
		else{
			System.out.println("The number is not Pallindrome");
		}
	}	*/
	
	//StringBuffer sb=new StringBuffer(String.valueOf(number));
	//StringBuffer rev=sb.reverse();
	StringBuilder sb=new 	StringBuilder();
	sb.append(number);
	StringBuilder rev=sb.reverse();
	System.out.println("The reverse number is:"+rev);
	}
}