package javapackage;

public class StringandStringBuffered 
{
	public static void main(String[] args) 
	{
		//String is immutable(unchangeable)
		String s="Sandeep";
		s.concat("Tathvam");
		System.out.println(s);
		//StringBuffer is Mutable(Changeable)
		StringBuffer sb=new StringBuffer("Tathvam");
		sb.append("VishnuSandeep");
		System.out.println(sb);
		//case2 for String(it refers content comparision)
		String s1="abcd";
		String s2="abcd";
		System.out.println(s1==s2);//False
		System.out.println(s1.equals(s2));//True(overriden for content comparison)
		//Case2 for StringBuffer(reference comparison)
		StringBuffer sb1= new StringBuffer("abcde");
		StringBuffer sb2= new StringBuffer("abcde");
		System.out.println(sb1==sb2);//False
		System.out.println(sb1.equals(sb2));//False(not overriden for content comparison)
		//SubString
		String sg ="I have performed transaction 1/31/2019 from sbi account";
		System.out.println(sg.substring(29,38));
		System.out.println(sg.length());
		System.out.println(sg.replaceAll("sbi","IcIcI"));
		System.out.println(sg.toUpperCase());
		
	}
}
