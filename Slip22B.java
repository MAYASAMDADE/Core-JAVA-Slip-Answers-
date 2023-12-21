import java.util.Scanner;

class Slip22B{
	public static void main(String st[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No.:- ");
		int n=sc.nextInt();
		System.out.print("\n\tFactorial of "+n+" is:- ");
		int f=fact(n);
		System.out.print(f);
	}

	public static int fact(int n){
		if(n!=0)
			return (n * fact(n-1));
		else
			return 1;
	}
}
