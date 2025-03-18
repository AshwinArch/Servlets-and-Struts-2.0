package com.ash;

class P
{
	int i=10;
}
class k extends P
{
	int i=20;
}
public class File1
{
	static int i=10;
	static final char c;
	static{c='a';}
	static
	{
		final int i=20;
	}
	public static void main(String[] args)
	{
		System.out.println(c);
		System.out.println(i);
		double d=test(10);
		P p=new k();
		System.out.println(p.i);
		System.out.println(d);
		System.out.println(((k)p).i);
	}
	static float test(int i){return 70;}
}