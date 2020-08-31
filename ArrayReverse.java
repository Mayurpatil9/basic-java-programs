import java.util.Arrays;
import java.util.Scanner;

class ArrayReverse{
	public static void main(String[]args){
		int number;
		System.out.println("Enter the length of array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		int arr[]=new int[number];
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();
		}
		
		System.out.println("Array elements from user is:");
		for(int i=0;i<number;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse elements of array are:");
		for(int i=(number-1);i>=0;i--){
			System.out.println(arr[i]);
		}	
	}
}