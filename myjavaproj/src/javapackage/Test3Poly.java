package javapackage;

public class Test3Poly 
{
	public static void main(String[] args) 
	{
		Sample3 obj1=new Sample3(80);
		obj1.display();
		System.out.println();
		Sample3 obj2=new Sample3(180,"Sandeep");
		obj2.display();
		System.out.println();
		Sample3 obj3=new Sample3(8,180,"tvSandeep");
		obj3.display();
		System.out.println();
		Sample3 obj4=new Sample3(5,125,"SandeepTV",true);
		obj4.display();
	}
}
