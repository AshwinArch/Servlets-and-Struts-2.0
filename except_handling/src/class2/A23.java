package class2;


public class A23
{
	public static void main(String[] args)throws ClassNotFoundException
	{
//	{		
//		try
//		{
			Manager p1=new Manager();
			p1.test();		
//		}
//		catch(ClassNotFoundException ex)	
//		{
//			System.out.println(ex);
//		}
	}
}
class Manager
{
	void test()throws ClassNotFoundException
	{
		Class.forName("-----");
	}
}
//throws will transfer control to calling statement
