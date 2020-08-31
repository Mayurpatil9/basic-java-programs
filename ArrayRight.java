import java.util.Scanner;
class ArrayRight{
	public static void main(String[] args){
		int number,places;
		System.out.println("Enter the length of an array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		System.out.println("Enter the places to right shift");
		places=x.nextInt();
		
		System.out.println("Enter the elements of an array");
		
		int arr[]=new int[number];
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();		
		}
		
		for(int i=0;i<places;i++){
			int j,last;
			last=arr[number-1];
			for(j=number-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		
		System.out.println("Array after right rotation");
		for(int i=0;i<number;i++){
			System.out.println(arr[i]+"");
		
		}
	}	
}