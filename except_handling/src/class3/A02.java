package class3;

public class A02
{
	void test()throws ClassNotFoundException
	{
		System.out.println("Done");
	}
}
class Prog2
{
	public static void main(String[] args)
	{
		A02 a1=new A02();
		a1.test();
	}
}
//compiler already knows checked exception so it won't be tolerate any misuse.
//we will have to define Classnotfoundexception in void test of class A.