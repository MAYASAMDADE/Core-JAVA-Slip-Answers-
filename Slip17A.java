import java.util.*;
class Product
{
	int pid,qty;
	float price;
	String pname;
	
	Product(int p,int q,float pr,String a){
		pid=p;
		qty=q;
		price=pr;
		pname=a;
	}

	public void Display(){
		System.out.println("Product Id:- "+pid+"\nProduct Name:- "+pname+"\nProduct Price:- "+price+"\nProduct Quantity:- "+qty);
		System.out.println("\tTotal Amount:- Rs."+(price*qty));
	}
}


class Slip17A{
	public static void main(String st[]){
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter No. of Products's:- ");
		int n = sc.nextInt();
		Product pro[]=new Product[n];
		
		for(int f=0;f<n;f++){
			System.out.print("\n \t=== Enter "+(f+1)+" Product Details ===\n");
			System.out.print("Enter Product Id:- ");
			int p=sc.nextInt();
			System.out.print("Enter Product Name:- ");
			String a=s.nextLine();
			System.out.print("Enter Product Price:- ");
			float pr=sc.nextInt();
			System.out.print("Enter Product Quantity:- ");
			int q=sc.nextInt();
			pro[f]=new Product(p,q,pr,a);
		}

		System.out.print("\n\t ===== Displaying Product ===== \n");
		for(int f=0;f<n;f++){
			System.out.print("\n \t=== Displaying "+(f+1)+" Product Details ===\n");
			pro[f].Display();
		}
	}
}
