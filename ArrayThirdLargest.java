import java.util.Scanner;
class ArrayThirdLargest{
	public static void main(String []args){
		int number,temp;
		System.out.println("Enter length of an array:");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		System.out.println("Enter the elements of an array");
		int arr[]=new int[number];		
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();		
		}
		
		for(int i=0;i<number;i++){
			for(int j=i+1;j<number;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		
		System.out.println("Largest array element"+arr[number-1]);
		
		
		System.out.println("Second Largest array element"+arr[number-2]);
		
		System.out.println("Third Largest array element"+arr[number-3]);
	}
}	
