package class2;
class F
{
	int i,j;
	public boolean equals(Object obj)
	{
		F f=(F) obj;
		return i==f.i && j==f.j;
	}
}
public class A04
{
	public static void main(String[] args)
	{
		F f1=new F();
		f1.i=100;
		f1.j=200;
		F f2=new F();
		f2.i=100;
		f2.j=200;
		System.out.println(f1.equals(f2));
	}
}
