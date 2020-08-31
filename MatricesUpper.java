import java.util.Scanner;
class MatricesUpper{
	public static void main(String []args){
		int rows1,cols1;
		System.out .println("Enter size of 1 array");
		Scanner x=new Scanner(System.in);
		rows1=x.nextInt();
		cols1=x.nextInt();
		
		
			
		int arr1[][]=new int[rows1][cols1];
		
		System.out.println("Enter elements of first array: ");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					arr1[i][j]=x.nextInt();		
				}
			}

		if(rows1!=cols1){
			System.out.println("Matrix should be a square matrix:");
		}
		
		else{
			System.out.println("Upper triangular matrix is as follows:");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					if(i>j){
						System.out.println(0);
					}
					else{
						System.out.println(arr1[i][j]);
					}		
				}
			}
			
		} 
	}
}	