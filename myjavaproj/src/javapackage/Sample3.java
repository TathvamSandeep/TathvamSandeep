package javapackage;

public class Sample3 
{
	//Data Members
	public int w;
	public float x;
	public String y;
	public boolean z;
	//Constructor Method1
	public Sample3(int temp)
	{
		w=temp;
		y="Sandeep";
	}
	//Constructor Method2
	public Sample3(int temp, String temp1)
	{
		w=temp;
		y=temp1;
	}
	//Constructor Method3
	public Sample3(int temp,float temp1,String temp2)
	{
		w=temp;
		x=temp1;
		y=temp2;
	}
	//Constructor Method4
	public Sample3(int temp,float temp1,String temp2,boolean temp3)
	{
		w=temp;
		x=temp1;
		y=temp2;
		z=temp3;
	}
	//Operational Methods
	public void display()
	{
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}