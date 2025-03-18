package class1;

public class A00
{
	public static void main(String[] args)
	{
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}
