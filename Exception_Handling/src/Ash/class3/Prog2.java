package Ash.class3;
class A
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
		A a1=new A();
		a1.test();
	}
}
//compiler already knows checked exception so it won't be tolerate any misuse.
//we will have to define Classnotfoundexception in void test of class A.