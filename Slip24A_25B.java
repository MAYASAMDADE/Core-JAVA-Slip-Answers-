import series.*;
class Slip24A_25B
{
	public static void main(String arg[])
	{
		Fibo ob1=new Fibo();
		System.out.println("printing the fibonacci series :");
		ob1.fibno(10);
	
		Cube ob2=new Cube();
		System.out.println("printing the cube series :");
		for(int i=1;i<=10;i++)
		{
			int c=ob2.cubeseries(i);
			System.out.println(c);
		}

		Square ob3=new Square();
		System.out.println("printing the square series :");
		for(int i=1;i<=10;i++)
		{
			int s=ob3.squareseries(i);
			System.out.println(s);
		}
	}
}