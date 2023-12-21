class Slip4B
{
	public static void main(String arg[])
	{
		String str=arg[0];
		for(int i=0;i<str.length();i=i+2)
		{
			System.out.println(str.charAt(i));
		}
	}
}