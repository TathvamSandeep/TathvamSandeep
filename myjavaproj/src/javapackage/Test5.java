package javapackage;

public class Test5 
{
	public static void main(String[] args) 
	{
		Sample5 obj=new Sample5(150,200);
		int x=obj.add();
		System.out.println(x);
		Sample5 obj1=new Sample5(150,200);
		int y=obj1.add(250);
		System.out.println(y);
		Sample5 obj2=new Sample5(150,150);
		int z=obj2.add(180, 180);
		System.out.println(z);
	}
}