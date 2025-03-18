package class3;
public class A12
{
	public void method()
	{
		System.out.println(1);
	}
	public static void main(String[] args)
	{
		A12 a1=new A12();
		try
		{
		a1.method();
		}
		catch(Exception ex)
		{
			System.out.println(ex);}
		}
}
