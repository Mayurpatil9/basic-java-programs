import java.util.Scanner;
import java.util.Arrays;
class ArrayEvenPosition{
	public static void main(String []args){
		int number;
		System.out.println("Enter length of an array");
		Scanner x=new Scanner(System.in); 
		number=x.nextInt();
		
		int arr[]=new int[number];
		System.out.println("Enter  elements of an array");
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();
		}
		
		System.out.println("Array elements present on even positions are:");
		for(int i=1;i<number;i=i+2){                         //Option:01
			System.out.println(arr[i]);
		}	
		
		System.out.println("Array elements present on odd positions are:");
		for(int i=0;i<number;i=i+2){
			System.out.println(arr[i]);
		}

		System.out.println("Array elements present on even positions are:");//Option:02
		for(int i=0;i<number;i++){
			if(i%2!=0){
			System.out.println(arr[i]);
			}
		}
	}
} 