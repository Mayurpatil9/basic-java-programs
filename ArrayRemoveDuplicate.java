//Remove Duplicate Element in Array using Temporary Array
import java.util.Scanner;
class ArrayRemoveDuplicate{
	public static void main(String []args){
			int number;
			System.out.println("Enter the length of an array");
			Scanner x=new Scanner(System.in);
			number=x.nextInt();
			
			int arr[]=new int[number];
			
			System.out.println("Enter the elements of an array");
			for(int i=0;i<number;i++){
				arr[i]=x.nextInt();			
			}
			System.out.println("Repeated elements present in array");
			for(int i=0;i<number;i++){
				for(int j=i+1;j<number;j++){
					if(arr[i]==arr[j]){
					System.out.println(arr[j]);					
					}
				}
			}
			
			
			System.out.println("Array elements after removing dupliacte elements");
			for(int i=0;i<number;i++){
				for(int j=i+1;j<number;j++){
					if(arr[i]!=arr[j]){
						System.out.println(arr[i]);	
					}
					
				}
			}
			

	}
}