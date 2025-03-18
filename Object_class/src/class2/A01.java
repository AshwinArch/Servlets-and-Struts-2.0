package class2;
class C
{
	int i;
}
public class A01
{
	public static void main(String[] args)
	{
		 C c1=new C();
		 c1.i=10;
		 C c2=new C();
		 c2.i=10;
		 System.out.println(c1==c2);
		 System.out.println(c1==c1);
		 System.out.println(c1.equals(c2));
		 System.out.println(c1.equals(c1));
	}
}
