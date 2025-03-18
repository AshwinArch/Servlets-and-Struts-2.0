package class2;
class B
{
	int i;
}
public class A00
{
	public static void main(String[] args)
	{
		 B b1=new B();
		 b1.i=10;
		 B b2=b1;
		 System.out.println(b1==b2);
		 System.out.println(b1.i==b2.i);
	}
}
