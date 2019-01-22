package javapackage;

public class Q113 
{

	void m(int k)
	{
		System.out.println(k);
	}
	void n(Integer k)
	{
		m(k);
	}
	public static void main(String[] args) 
	{
		int i=10;
		new Q113().n(i);
	}

}
