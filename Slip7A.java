import java.util.*;
class CricketPlayer
{
	int pid,totalRuns,InningsPlayed,NotOuttimes;
	String pname;
	public int AvgRuns;
		
	CricketPlayer(int id,int t,int i,int n,String nm)
	{
		pid=id;
		totalRuns=t;
		InningsPlayed=i;
		NotOuttimes=n;
		pname=nm;
		
	}
		
	public void CalculateAvg()
	{
		int a;
		a=(InningsPlayed-NotOuttimes);
		AvgRuns=totalRuns/a;
	}
	
	public void display()		
	{
		System.out.println("player id"+pid+"\nplayers name"+pname+"\ntotal runs"+totalRuns+"\nInning's Played"+InningsPlayed+"\ntimes not out"+NotOuttimes+"\naverage runs"+AvgRuns);
	}
}

class Slip7A
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of player's:");
		int ch=sc.nextInt();
		CricketPlayer cp[]=new CricketPlayer[ch];
		for(int f=0;f<ch;f++)
		{
			System.out.println("enter ==="+(f+1)+"===detail");
			System.out.print("enter id");
			int id=sc.nextInt();
			System.out.print("enter name:");
			String nm=s.nextLine();
			System.out.print("enter total runs:");
			int t=sc.nextInt(); 
			System.out.print("enter Innings played:");
			int i=sc.nextInt();
			System.out.print("enter playes not out:");
			int n=sc.nextInt();
			cp[f]=new CricketPlayer(id,t,i,n,nm);
			cp[f].CalculateAvg();
		}
		
		System.out.println("\n\t===dispalying players details===\n");
		for(int f=0;f<ch;f++)
		{
			System.out.println("\n\t===dispalying  "+(f+1)+"  detail\n");
			cp[f].display();
		}
		
		System.out.println("\n\t===dispalying details of player having maximum average :===\n");
		int av=cp[0].AvgRuns;
		int avid=0;
		for(int f=0;f<ch;f++)
		{
			if(cp[f].AvgRuns > av)
				avid=f;
		}
			cp[avid].display();
	
	}
}