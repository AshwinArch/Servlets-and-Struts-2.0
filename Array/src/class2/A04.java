package class2;

public class A04
{
	public static void main(String[] args)
	{
		float x[]=new float[5];
		float y[]=new float[15];
		System.out.println(x.length);
		System.out.println(y.length);
		x=y;y=x;
		System.out.println(x.length);
		System.out.println(y.length);
	}
}
