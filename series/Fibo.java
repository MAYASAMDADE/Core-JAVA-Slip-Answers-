package series;
public class Fibo
{
	public void fibno(int n)	
	{
		int f0=0,f1=1,f2;
		System.out.println(f0+"\n"+f1);
		
		for(int i=0;i<n-2;i++)
		{
			f2=f0+f1;
			System.out.println(f2);
			f0=f1;
			f1=f2;
		}
	}
}
	