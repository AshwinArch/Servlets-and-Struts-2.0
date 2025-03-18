package class2;

public class A13
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("abc");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(1);
		}
	}
}
