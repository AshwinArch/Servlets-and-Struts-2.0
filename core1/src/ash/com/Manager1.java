package ash.com;
interface A1
{
	void test1();
}
public class Manager1
{
public static void main(String[] args)
{
	A1 a1=new A1()
			{
				public void test1()
				{
					System.out.println("done");
				}
			};
	a1.test1();
}
}
