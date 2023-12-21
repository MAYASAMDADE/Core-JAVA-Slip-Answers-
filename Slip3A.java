import java.util.*; 

abstract class Shape{
	final float pi=3.14f;
	float h,r,aresult,vresult,l;
	abstract public void area();
	abstract public void volume();
}

class Cone extends Shape{
	Cone(float a,float b,float c){
		super.h=a;
		super.r=b;
		super.
		l=c;
		System.out.println("Cone's Height :- "+super.h+", Radius:- "+super.r+",length"+super.l);
	} 
	
	public void area(){
		//super.aresult=(super.pi*(super.r*super.h))+(super.pi*(super.r*super.r));
		super.aresult=(super.pi*super.r*super.l);
		System.out.println("Area of Cone:- "+super.aresult);
	}
	public void volume(){
		float a=0.33f;
		super.vresult=a*super.pi*(super.r*super.r)*super.h;
		System.out.println("Volume of Cone:- "+super.vresult);
	}
}

class Cylinder extends Shape{
	Cylinder(float a,float b){
		super.h=a;
		super.r=b;
		System.out.println("Cylinder's Height :- "+super.h+", Radius:- "+super.r);
	} 
	
	public void area(){
		super.aresult=2*(super.pi*(super.r+super.h));
		System.out.println("Area of Cylinder:- "+super.aresult);
	}
	public void volume(){
		super.vresult=super.pi*((super.r*super.h)*super.h);
		System.out.println("Volume of Cylinder:- "+super.vresult);
	}
}

public class Slip3A{
	public static void main(String arg[]){
		System.out.println("\t === Cone === ");
		System.out.println("Enter Cone's Height:- ");
		Scanner sc= new Scanner(System.in);
		float a =sc.nextInt();
		System.out.println("Enter Cone's Radius:- ");
		float b =sc.nextInt();
		System.out.println("Enter Cone's length:- ");
		float c =sc.nextInt();
		Cone co=new Cone(a,b,c);
		co.area();
		co.volume();
	
		System.out.println("\n\t === Cylinder === ");
		System.out.println("Enter Cylinder's Height:- ");
		a =sc.nextInt();
		System.out.println("Enter Cylinder's Radius:- ");
		b =sc.nextInt();
		Cylinder cy =new Cylinder(a,b);
		cy.area();
		cy.volume();
	}
}
