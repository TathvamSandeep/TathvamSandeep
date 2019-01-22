package javapackage;

public interface Myinterface 
{
	public int x=10;//need to treat as constant(final)otherwise it will not allow data members
	public int add(int x,int y);
	public int substract(int x,int y);
	public int multiply(int x,int y);
	public int divide(int x,int y);
	
	public static int add1(int x, int y)//we need to make as static, otherwise it can`t allow Methods in Interface class
	{
		return y;	
	}
}