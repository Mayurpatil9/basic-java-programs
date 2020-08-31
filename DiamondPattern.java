import java.util.Scanner;
class DiamondPattern{
	public static void main(String [] args){
		int i,j,k,rows;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number");
		rows=x.nextInt();
		for(i=0;i<rows;i++){
			for(j=i;j<(rows-1);j++){
				System.out.print(" ");			
			}
			
			for(k=0;k<=i;k++){
				System.out.print("*");	
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		for(i=0;i<(rows-1);i++){
			for(j=0;j<=i;j++){
				System.out.print(" ");			
			}
			
			for(k=i;k<(rows-1);k++){
				System.out.print("*");	
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}	