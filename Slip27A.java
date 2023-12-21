class NooutofRangeException extends Exception
{
	NooutofRangeException()
	{
		System.out.println("sorry, wrong input number");
	}
}

public class Slip27A
{
	static int n,i;
	public static void main(String arg[])	
	{
		try
		{
			n=Integer.parseInt(arg[0]);
			if(n>100)
				throw new NooutofRangeException();
			else
			{	
				System.out.println("factors of "+n+ "are ");
				for(i=1;i<=n;i++)
				{
					if(n%i==0)
					{
						System.out.println("\t"+i);
					}
				}
			}
		}


		catch(NooutofRangeException e)
		{
			System.out.println("sorry, wrong input number");
		}
	}
}

				