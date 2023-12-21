import java.util.*;
class Slip9B
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to print the fibonacci : ");
		int n=sc.nextInt();
		int f0=0,f1=1,f2;
		System.out.println(f0 + "\n" +f1);
		for(int i=0;i<n-2;i++)
		{
			
			f2=f0+f1;
			System.out.println(f2);
			f0=f1;
			f1=f2;
		}
	}
}
			