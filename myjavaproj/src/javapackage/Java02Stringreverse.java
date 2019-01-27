package javapackage;

public class Java02Stringreverse 
{
	public static void main(String[] args) 
	{
		String ip = "Tathvam Vishnu Sandeep";
		char[] try1=ip.toCharArray();
		for(int i=try1.length-1; i>=0; i--)
		{
			System.out.print(try1[i]);
		}
	}
}
