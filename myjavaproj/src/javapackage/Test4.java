package javapackage;

public class Test4 
{
	public static void main(String[] args) 
	{
		Sample4 obj=new Sample4(50,30);
		obj.add();
		Sample4 obj1=new Sample4(50,15);
		int x=obj1.add1();
		System.out.println(x);
	}
}