package class2;
class E
{
	int i;
	public boolean equals (Object obj)
	{
		E e1=(E)obj;
		return i==e1.i;
	
	}
}
public class A03
{
	public static void main(String[] args)
	{
		E e1=new E();
		E e2=new E();
		e1.i=e2.i=100;
		System.out.println(e1.equals(e2));
	}
}
