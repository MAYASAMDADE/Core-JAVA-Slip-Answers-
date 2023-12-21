import java.io.*;
public class Slip5A
{
	public static void main(String arg[])throws Exception
	{
		File f;
		for(int i=0;i<arg.length;i++)
		{
			f=new File(arg[i]);
			if(f.exists())
			{
				if(arg[i].endsWith(".txt"))
				{
					f.delete();
					System.out.println("\tfile deleted :"+arg[i]);			
				}
				else
				{
					System.out.println("\tfile not txt details are:");
					System.out.println("\tfile name : "+f.getName());
					System.out.println("\tfile path : "+f.getName());
					System.out.println("\tfile length : "+f.length());
				}
			}
			else
				System.out.println("\tnot found :"+arg[i]);
		}
	}
}


/*Write a java program to accept list of file names through command line. 
Delete the files having extension .txt. Display name, location and size of 
remaining files.*/