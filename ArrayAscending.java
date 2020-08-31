import java.util.Scanner;
class ArrayAscending{
	public static void main(String[] args){
		int number,temp;
		System.out.println("Enter length of an array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		int arr[]=new int[number];
		
		System.out.println("Enter elements of an array");
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
		
		System.out.println("Array elements in ascending order");
		for(int i=0;i<number;i++){
			
			System.out.println(arr[i]);
		}		
	}
}	