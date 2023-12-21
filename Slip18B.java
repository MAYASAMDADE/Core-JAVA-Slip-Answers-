import java.util.*;

class Slip18B{									//function overloading
	public static void main(String a[]){
		float r,w,l;
		int b,h;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Radius:- ");
		r=sc.nextFloat();
		System.out.print("Enter Width:- ");
		w=sc.nextFloat();
		System.out.print("Enter Length:- ");
		l=sc.nextFloat();
		System.out.print("Enter Breadth:- ");
		b=sc.nextInt();
		System.out.print("Enter Height:- ");
		h=sc.nextInt();
		System.out.println(" \n\t === Displaying Area's === ");
		area(r);
		area(b,h);
		area(w,l);
	}

	public static void area(float r){
		final float pi=3.14f;
		float a = pi*(r*r);
		System.out.println("Area of Circle:- "+a);
	}
	
	public static void area(int b,int h){
		int a =(b*h)/2 ;
		System.out.println("Area of Triangle:- "+a);
	}

	public static void area(float w,float l){
		float a=w*l ;
		System.out.println("Area of Rectangle:- "+a);
	}
}
