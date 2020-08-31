import java.util.Scanner;
class ArrayMultiplication{
	public static void main(String []args){
		int number;
		System.out.println("Enter length of an array");
		Scanner x=new Scanner(System.in);
		number=x.nextInt();
		
		int arr[]=new int[number];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<number;i++){
			arr[i]=x.nextInt();
		}
		System.out.println("Multiplication of each element");
		
		for(int i=0;i<number;i++){
			int sum=1;
			for(int j=0;j<number;j++){
				if(i!=j){
				 sum=sum*arr[j];
				 }
			}
			System.out.println(sum);
			//sum=0;
			//sum=1;
			
		}
	
	}
}