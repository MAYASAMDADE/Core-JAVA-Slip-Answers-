//Write a java program to calculate the power of a number using recursion
import java.util.*;
class Slip14B
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		int n1=sc.nextInt();
		System.out.println("\nenter the power :");
		int n2=sc.nextInt();
		int p=pow(n1,n2);
		System.out.println(n1 +"^"+ n2 + "=" +p);
	}
	
		public static int pow(int n1,int n2)
	{
		if(n2!=0)
		{
			return(n1*pow(n1,n2-1));
			
		}
		
		else
			return 1;
	}
}