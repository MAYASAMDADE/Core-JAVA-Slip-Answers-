import java.util.*;
class ZeroException extends Exception
{
	ZeroException()
	{
		System.out.println("sorry,zero entered");
	}
}

class Slip6B
{
	static int sum=0;
	public static void main(String arg[])
	{
		try
		{
			int n,r=0,l;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the number :");
			n=sc.nextInt();
			if(n==0)
			{
				throw new ZeroException();
			}
			else
			{
				l=n%10;
				while(n>0)
				{
					r=n%10;
					n=n/10;
				}
			sum=l+r;
			System.out.println("the sum of first and last number :"+sum);
			}
		}
	
		catch(ZeroException ob)
		{
			System.out.println("Handling zero excepttion");
		}
	}
}