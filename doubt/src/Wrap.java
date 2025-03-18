class A12
{
	void test(Byte b)
	{
		System.out.println("ByTe");
	}
	void test(byte ... b)
	{
		System.out.println("VAR ARGS");
	}
}
class Wrap
{/*	static void test(Byte b1,Byte b2)
	{		System.out.println("Byte");	}
	static void test(byte ... b)
	{		System.out.println("byte ....");
			}*/
	public static void main(String[] args)
	{
		A12 a1=new A12();
		a1.test((byte)10);
	}}