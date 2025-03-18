package class2;

public class A05
{
	static int test(String i)
	{
		try
		{
	//		return 100;
		}
		catch(NumberFormatException ex1)
		{
			return 10;
		}
/*		finally
		{
			return 500;
		}
	*/	
		return 200;
	}
}
//if ( try and finally ) do not have return then external will work.
//and if ( catch and finally ) do not have return then external return will work.
