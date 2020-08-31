import java.util.Scanner;
class ArraySum{
	public static void main(String []args){
		int number,sum=0;
		System.out.println("Enter the length of an array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		
		int arr[] =new int[number];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();		
		}
		
		
		
		for(int i=0;i<number;i++){
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of the elements of an array"+sum);			
	}
}