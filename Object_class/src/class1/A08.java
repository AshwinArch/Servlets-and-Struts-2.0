package class1;
class H
{
	int i;
	double j;
	String s1;
	char a;
	@Override
	public String toString()
	{
		return "i = "+ i +",j = "+ j +",s1 = "+ s1 +", a="+a;
		// TODO Auto-generated method stub
	}
}
public class A08
{
	public static void main(String[] args)
	{
		H h1=new H();
		System.out.println(h1);
		h1.i=10;
		h1.j=20.090;
		h1.s1="abc";
		h1.a='y';
		System.out.println(h1);
	}
}
