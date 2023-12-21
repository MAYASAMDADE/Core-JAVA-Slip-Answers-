import java.util.Scanner;

class Slip25B{
	public static void main(String st[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:- ");
		String s = sc.nextLine();
		System.out.print("\nSting entered is:- "+s);
		StringBuffer buf = new StringBuffer(s);
		buf=buf.reverse();
		String b = new String(buf);
		if (b.equals(s))
			System.out.print("\n\tString is Palindrome ");
		else
			System.out.print("\n\t!!! String is NOT Palindrome !!!");
	}
}
