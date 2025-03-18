/**
 * 
 */
package com.ash;

/**
 * @author Diesel
 *
 */
public class factorial
{
	//iteration
	public static void main(String[] args)
	{
		System.out.println(fact(5));
	}
	public static int factorial(int n)
	{
		int result =1;
		for (int i = 1; i <= n; n--)
		{
			result= n*result;
		}
		return result;
	}
	
	//recursive
	public static int fact(int n)
	{
		//int result=1;
		if (n==0){
			return 1;
		}
		else
		{	
			n=n*fact(n-1);
		}
		return n;
	}
}
