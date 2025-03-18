/**
 * 
 */
package com.ash;

/**
 * @author Diesel
 *
 */
public class CustomExcep
{
	public static void main(String[] args)
	{
		CustomExcep ce=new CustomExcep();
		try{
			System.out.println("exception is coming");
		ce.giveExcep();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void giveExcep() throws Exception
	{
		throw new Exception("Hello, i am exception, how are you doing today ?");
	}
}
