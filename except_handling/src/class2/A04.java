package class2;

public class A04
{
	static int test(String s1)
	{
		try
		{
			return 100;
		}   
		catch(NumberFormatException ex1)
		{
			return 0;
		}
		finally
		{
			return 100;
		}
//		return 299;
	}
}
// if ( try and finally ) do not have return then external will work.
//and if ( catch and finally ) do not have return then external return will work.