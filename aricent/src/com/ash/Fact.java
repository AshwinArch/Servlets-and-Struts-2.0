/**
 * 
 */
package com.ash;

/**
 * @author Diesel
 *
 */
public class Fact
{
	public static void main(String[] args)
	{
		Fact fa=new Fact();
		System.out.println(fa.find_fact(5));
	}
	public int find_fact(Integer i)
	{
		if(i==0)
		{
			return 1;
		}
		else{
			i=i*find_fact(i-1);
			return i;
		}
	}
}
