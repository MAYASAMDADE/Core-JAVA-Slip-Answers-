import java.io.*;
class Slip21B
{
	public static void main(String a[]) throws Exception
	{
		FileReader fr= new FileReader(a[0]);
		int data=0;
		char ch;
		String s=new String("");
		while(data!= -1)
		{
			data=fr.read();
			ch=(char)data;
			if(data!=-1)
			s=s+ch;
		}
		StringBuffer sb= new StringBuffer(s);
		sb=sb.reverse();
		s=new String(sb);
		System.out.print(s);
		fr.close();
	}	
}
