package javapackage;

import java.util.Scanner;

public class Test14sorting 
{
	public static void main(String[] args) 
	{
		//Declare 5 members Static Array
		int x[]=new int[5];
		//Store 5 numbers into an array
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter "+i+" Number");
			x[i]=sc.nextInt();
		}
		//Sorting
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		//Display Array Numbers after sorting
		for(int i=0;i<5;i++)
		{
			System.out.println(x[i]+" ");
		}
	}
}