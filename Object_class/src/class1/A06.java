package class1;
class F1
{
	int i;
	public String toString()
	{
		return "i = "+i;
	}
}
public class A06
{
	public static void main(String[] args)
	{
		F1 f1=new F1();
		System.out.println(f1);
		f1.i=10;
		System.out.println(f1);
	}
}
