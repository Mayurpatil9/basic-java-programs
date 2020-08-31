import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		int number,count=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=x.nextInt();
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count++;
			}		
		}
		if(count==2){
			System.out.println("Number is Prime");
		}
		else{
			System.out.println("Number is not Prime");		
		}	
	}
}