package class2;
public class A24
{
	A24() throws ClassNotFoundException
	{
		Class.forName("----");
	}
	public static void main(String[] args) 
	{
		try
		{
			A24 p1=new A24();
			System.out.println("done");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
}
//throws will transfer control to calling statement