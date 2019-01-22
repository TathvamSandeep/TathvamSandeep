package javapackage;

public class Sample4 
{
	//Data Members
	public int ip1;
	public int ip2;
	//Constructor Methods
	public Sample4(int temp1,int temp2)
	{
		ip1=temp1;
		ip2=temp2;
	}
	//Operational Methods
	public void add() 
	{
		int op=ip1+ip2;
		System.out.println(op);
	}
	public int add1()
	{
		int op=ip1+ip2;
		return(op);
	}
}
