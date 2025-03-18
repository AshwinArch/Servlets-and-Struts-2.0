package ash.com;
interface B1
{
	void test1();
}
public class Manager2
{
	static void method1(B1 b)
	{
		b.test1();	
	}
	public static void main(String[] args)
	{
			B1 b=new B1()
			{
				public void test1()
				{
				System.out.println("done");
			}};
			method1(b);
}
}
