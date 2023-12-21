import java.util.*;
interface Shape
{
	abstract public void area(float r);
	final float pi=3.14f;
}

class Circle implements Shape
{
	public void area(float r)
	{
		float a=pi+(r*r);
		System.out.println("area of circle :"+a);
	}
}

class Sphere implements Shape
{
	public void area(float r)
	{
		float a1=4*(pi*(r*r));
		System.out.println("area of Sphere :"+a1);
	}
}

class Slip8B
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Circle c1=new Circle();
		Sphere s1=new Sphere();
		System.out.println("enter radius :");
		float f=sc.nextFloat();
		c1.area(f);
		s1.area(f);
	}
}

