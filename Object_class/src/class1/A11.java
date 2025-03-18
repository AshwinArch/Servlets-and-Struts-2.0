package class1;
class K
{
	int i;
	@Override
	public String toString()
	{
		return "i = "+i;
	}
}
class L
{
	int j;
	K k1;
	@Override
	public String toString()
	{
		return "j = "+j+"," +k1;
	}
}
public class A11
{
	public static void main(String[] args)
	{
		K k1=new K();
		k1.i=100;
		L l1=new L();
		l1.j=2000;
		l1.k1=k1;
		System.out.println(l1);
	}
}
