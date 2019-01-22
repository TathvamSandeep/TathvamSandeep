package javapackage;

public class Sample5 
{
	//Data Members
	public int ip1;
	public int ip2;
	//Constructor Methods
	public Sample5(int temp1,int temp2)
	{
		ip1=temp1;
		ip2=temp2;
	}
	//Operational Methods
	public int add()
	{
		int op=ip1+ip2;
		return op;
	}
	public int add(int a)
	{
		ip1=a;
		int op=ip1+ip2;
		return op;
	}
	public int add(int a,int b)
	{
		ip1=a;
		ip2=b;
		int op=ip1+ip2;
		return op;
	}
}
