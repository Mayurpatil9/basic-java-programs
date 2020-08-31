import java.util.Scanner;
class PascalTriangle{
	public static void main(String [] args){
		int i,j,k,rows;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=x.nextInt();
		for(i=0;i<rows;i++){
			for(j=0;j<=i;j++){
				System.out.print(j);			
			}
			System.out.println("");
		}
		
		
		for(i=0;i<(rows-1);i++){
			for(j=i;j<(rows-1);j++){
				System.out.print(i);			
			}
			System.out.println("");
		}
	}
}	