
public class B11
{
	public static void go(short n)
	{
		System.out.println("short");
		
	}
	public static void go(Short n)
	{
		System.out.println("Short");
	}
	public static void main(String[] args)
	{
/*		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(true);
		Boolean b3=true;
		Boolean b4=true;
	System.out.println(b1==b2);
	System.out.println(b1==b3);
	System.out.println(b3==b4);
	System.out.println(b4==b1);
*/		Short y=6;
		int z=7;
		go(y);
		go((short)z);
	}}
