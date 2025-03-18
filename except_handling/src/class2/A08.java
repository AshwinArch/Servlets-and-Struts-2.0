package class2;

public class A08
{
		public static void main(String[] args)
		{
			try
			{
				Class.forName("---");
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println(ex);
			}
			
		}
	}
