import java.util.Scanner;
class TriangleStarPattern{
	public static void main(String []args){
		int i,j,k,rows,n=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows=x.nextInt();
		
		for(i=1;i<=rows;i++){
			for(j=i;j<=rows;j++){
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++){
				if(k==1||k==(2*i-1)||i==rows){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}	
	}
} 