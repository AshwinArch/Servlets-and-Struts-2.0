package ash.com;

abstract class Abs
{
	void test1()
	{
			System.out.println(1);
	}
	abstract void test2();
	
}
class Manager
{
	public static void main(String[] args)
	{
		Abs a1=new Abs()
					{
						void test2()
						{
							System.out.println(2);
						}
					};
		Abs a2=new Abs()
					{
						void test2()
						{
							System.out.println(4);
							
						}
						void test1()
						{
							System.out.println(3);
							
						}
					};
		
		a1.test1();
		a1.test2();
		a2.test1();
		a2.test2();
		
		
	}
		
}
