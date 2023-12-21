import java.util.*;

class Slip16B{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:- ");
		int n=sc.nextInt();
		int r= Sum(n);
		System.out.println("Sum of Digits of a Number= "+r);		
	}

	
	public static int Sum(int n){
		if(n!=0){
			return (n %10 + Sum(n /10));
		}
		else 
			return 0;
	}
}
