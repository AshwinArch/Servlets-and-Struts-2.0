
public class Z
{
	int i;
	public static void main(String[] args)
	{
		Z z1=new Z();
		Z z2=new Z();
		z1.i=140;
		z2.i=140;
		System.out.println(z1==z2);
		System.out.println(z1.equals(z2));
		System.out.println(z1.hashCode());
		System.out.println(z2.hashCode());
	}
}
