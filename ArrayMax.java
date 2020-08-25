import java.util.Arrays;
import java.util.Scanner;
class ArrayMax{
	public static void main(String []args){
		int number;
		System.out.println("Enter the length of an array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		System.out.println("Enter elements of an array : ");
		
		int arr[]=new int[number];
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();
		}
		int max=arr[0];
		
		System.out.println("Array elements are");
		for(int i=0;i<number;i++){
			System.out.println(arr[i]);
		}
		
		for(int i=1;i<number;i++){
		    if(arr[i]>max){
			  max=arr[i];
			}
		}
		
		System.out.println("Maximum elements of an array : "+max);		
	}
}