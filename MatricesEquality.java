import java.util.Scanner;
class MatricesEquality{
	public static void main(String []args){
		int rows1,cols1,rows2,cols2;
		System.out .println("Enter size of 1 array");
		Scanner x=new Scanner(System.in);
		rows1=x.nextInt();
		cols1=x.nextInt();
		
		System.out .println("Enter size of 2 array");
		//Scanner x=new Scanner(System.in);
		rows2=x.nextInt();
		cols2=x.nextInt();
	
	
		int arr1[][]=new int[rows1][cols1];
		int arr2[][]=new int[rows2][cols2];
		
		System.out.println("Enter elements of first array: ");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					arr1[i][j]=x.nextInt();		
				}
			}
	
	
		System.out.println("Enter elements of Second array: ");
			for(int i=0;i<rows2;i++){
				for(int j=0;j<cols2;j++){
					arr2[i][j]=x.nextInt();		
				}
			}
		
		if(rows1!=rows2||cols1!=cols2){
			System.out.println("Two matrices are not equal");
		}
		else{		
				for(int i=0;i<rows1;i++){
					for(int j=0;j<cols1;j++){
						if(arr1[i][j]==arr2[i][j]){
							System.out.println("Two matrices are Equal");	//See later
						}	
						else{
							System.out.println("Two matrices are not Equal");	
						}
					}
				}
			}
	}
}	