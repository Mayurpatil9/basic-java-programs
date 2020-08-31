
import java.util.Arrays;
import java.util.Scanner;

class ArrayReverse{
	public static void main(String []args){
	
	int number;
	
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the length of Array");
	number=x.nextInt();
	
	int arr[]=new int [number];
	
	System.out.println("Enter the array elements");
	for(int i=0;i<number;i++){
		arr[i]=x.nextInt();
	}
	System.out.println("Array elements from user is:");
	
	for(int i=0;i<number;i++){
		System.out.println(arr[i]);
	}
	}
} 
/*
 public class ArrayReverse {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        for(int i: arr){ //for printing array

            System.out.println(i);

        }


    }

}    */