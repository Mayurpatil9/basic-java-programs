import java.util.Scanner;
class MatricesAddition{
	public static void main(String []args){
	int rows,cols;
	System.out .println("Enter size of an array");
	Scanner x=new Scanner(System.in);
	rows=x.nextInt();
	cols=x.nextInt();
	
	
	int arr1[][]=new int[rows][cols];
	int arr2[][]=new int[rows][cols];
	int sum[][]=new int [rows][cols];
	int sub[][]=new int [rows][cols];
	int mul[][]=new int [rows][cols];
	
	
		System.out.println("Enter elements of first array: ");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr1[i][j]=x.nextInt();		
		}
	}
	
	
	System.out.println("Enter elements of Second array: ");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr2[i][j]=x.nextInt();		
		}
	}
	
	System.out.println("Sum of two arrays:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			sum[i][j]=arr1[i][j]+arr2[i][j];
			System.out.println(sum[i][j]+"\t");
		
		}
	}
	
	System.out.println("Substraction of two arrays:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			sub[i][j]=arr1[i][j]-arr2[i][j];
			System.out.println(sub[i][j]+"\t");
		
		}
	}	
	
	
	System.out.println("Multiplication of two arrays:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			mul[i][j]=0;
			for(int k=0;k<cols;k++){
				mul[i][j]=mul[i][j]+arr1[i][k]*arr2[k][j];
				
			}		
			System.out.println(mul[i][j]+"\t");
		}
	}	
	}
}