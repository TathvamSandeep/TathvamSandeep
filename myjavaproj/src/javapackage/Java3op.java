package javapackage;

import java.util.Scanner;

public class Java3op 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=n;i>=1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("s");
			}
		  System.out.println();
		}
	}
}