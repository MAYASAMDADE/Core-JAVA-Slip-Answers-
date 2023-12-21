import java.util.*;
class Slip15B
{
	public static void main(String arg[])
	{
		String[]names={"maya","suraj","manasi"};
		System.out.print("enter name to search  :");	
		Scanner sc=new Scanner(System.in);		
		String s=sc.nextLine();
		int i,flag=0;
		for(i=0;i<names.length;i++)
		{
			if(names[i].equals(s))
			{
				flag=1;
				break;
			}
			else
				flag=0;
		}

		if(flag==0)
		{
			System.out.println("name not present");
		}
		else
			System.out.println("name is at position : "+i);
	}
}
		