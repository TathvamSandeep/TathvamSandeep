package javapackage;

public class Myclass 
{
	public static void main(String[] args) 
	{
		Myabstract obj=new Mysubconcrete();
		int a=obj.add(10,20);
		System.out.println(a);
		int s=obj.substract(20,10);
		System.out.println(s);
		Mysubconcrete obj1=new Mysubconcrete();
		int a1=obj1.add(20,30);
		System.out.println(a1);
		int s1=obj1.substract(30,20);
		System.out.println(s1);
		int m1=obj1.multiply(10,10);
		System.out.println(m1);
	}
}
