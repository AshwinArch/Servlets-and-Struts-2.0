package ash.com;
public class Dddd
{
	Dddd()
	{
		this(19);
		System.out.println("Dddd()");
	}
	Dddd(int io)
	{
		this(19.10);
		System.out.println("Dddd(int i)");
	}
	Dddd(double d)
	{
		System.out.println("Dddd(Double d)");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args)
	{
		Dddd d1=new Dddd();
	}
}