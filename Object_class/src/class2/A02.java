package class2;
class D
{
	int i;
}
public class A02
{
	public static void main(String[] args)
	{
		 D c1=new D();
		 c1.i=10;
		 D c2=c1;
		 System.out.println(c1.equals(c2));
		 System.out.println(c1.equals(c1));
	}
}
