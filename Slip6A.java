import java.util.*;
class Slip6A{
	public static void main(String []arg){
		int mat[][]= new int[3][3];
		Scanner sc =new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print("Enter Data:- ");
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n\t Given Matrix:- ");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(" "+mat[i][j]);
			
			}
			System.out.print("\n");
		}
		System.out.println("\n\tMatrix after Transpose:- ");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(" "+mat[j][i]);
			
			}
			System.out.print("\n");
		}
	}

}
