package doubt1;
class wrap16
{
	public static void main (String args[])
	{
		A a=new A();
		a.test((byte)10);
	}
}
class A
{
	void test(byte b)
	{
		System.out.println("bYte");
	}
	void test(int i)
	{
		System.out.println("int");
	}
void test(Byte b)
	{
		System.out.println("byte");
	}
void test(byte ...b)
	{
		System.out.println("VAR ARGS");
	}
}
