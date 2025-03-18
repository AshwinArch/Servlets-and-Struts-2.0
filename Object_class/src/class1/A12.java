package class1;
class M
{
	int i;
	@Override
	public String toString()
	{
		return "i = "+i;
	}
}
class N extends M
{
	int j;
	public String toString()
	{
		return super.toString()+", j = "+ j;
	}
}
public class A12
{
	public static void main(String[] args)
	{
		N n1=new N();
		System.out.println(n1);
		n1.i=10;
		n1.j=20;
		System.out.println(n1);
	}
}
