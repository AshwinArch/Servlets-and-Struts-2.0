package theory;

public class Client
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		System.out.println(a.greeting()+" has name "+a.getName());
		System.out.println(b.greeting()+" has name "+b.getName());
	}
}
class A
{
	String name="A";
	String getName()
	{
		return name;
	}
	String greeting()
	{
		return "classA";
	}
}
class B extends A
{
	String name="B";
	String greeting()
	{
		return "classB";
	}
}
