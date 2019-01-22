package javapackage;

public class Sample9 
{
	//Data Members
	public int x;
	//constructor method
	private Sample9()
	{
		x=10;
	}
	//operational Methods
	public static Sample9 create()
	{
		Sample9 obj=new Sample9();
		return(obj);
	}
	public void display()
	{
		System.out.println(x);
	}
}
