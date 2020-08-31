import java.util.Scanner;
class MatricesFrequencyOddEven{
	public static void main(String []args){
		int rows1,cols1,counteven=0,countodd=0;
		System.out.println("Enter size of 1 array");
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
		
		for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					if(arr1[i][j]%2==0){
						counteven++;		
					}
					else{
						countodd++;
					}
				}
			}
			
		System.out.println("Frequancy of even elements: "+counteven);
		System.out.println("Frequancy of odd elements: "+countodd);
	}
}