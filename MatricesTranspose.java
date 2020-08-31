import java.util.Scanner;
class MatricesTranspose{
	public static void main(String []args){
		int rows1,cols1;
		System.out.println("Enter size of 1 array");
		Scanner x=new Scanner(System.in);
		rows1=x.nextInt();
		cols1=x.nextInt();
		
		
			
		int arr1[][]=new int[rows1][cols1];
		int transpose[][]=new int[rows1][cols1];
		
		System.out.println("Enter elements of first array: ");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					arr1[i][j]=x.nextInt();		
				}
			}
			
		System.out.println("Transpose of given matrix is as follows: ");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					transpose[i][j]=arr1[j][i];		
					System.out.println(transpose[i][j]);
				}
			}		
	}
}
		