package javapackage;

public class Myintfconcrt 
{
	public static void main(String[] args) 
	{
		Myinterface obj=new Myinterfaceconcrete();
		int o1=obj.add(10,10);
		obj.substract(10,10);
		obj.multiply(10,10);
		obj.divide(10,10);
	}
}
