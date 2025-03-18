package ash.com;

class D
{
	void test1()
	{
		System.out.println(1);
	}
}
class E
{
	static D getD()
	{
		return new D()
					{
						void test1()
						{ 
							System.out.println(2);
						}
					};
	}
}
class Manager5
{
	public static void main(String[] args)
	{
		D d1=new D();
		d1.test1();
		D d2=E.getD();
		d2.test1();
		System.out.println("Done");
	}
}