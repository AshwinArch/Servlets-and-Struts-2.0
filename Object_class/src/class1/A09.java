package class1;
class I
{
	@Override
	public String toString()
	{
		return "empty objects";
	}
}
public class A09
{
	public static void main(String[] args)
	{
		I i1=new I();
		System.out.print(i1);
	}
}
