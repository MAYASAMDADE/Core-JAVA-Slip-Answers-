import java.io.*;
class Slip23B  //the hidden file is Slip23B.txt
{
	public static void main(String a[]) throws Exception
	{
		File ob=new File(a[0]);
		if(ob.isHidden())
		{
			System.out.println("file is hidden");
			//System.out.println("path is:" +ob.getAbsolutePath());
		}
		else
		{
			System.out.println("path is:" +ob.getAbsolutePath());
			System.out.print("file is not hidden");
		}	
	}
}
