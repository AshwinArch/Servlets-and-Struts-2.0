package class1;

public class A02
{
	public static void main(String[] args)
	{
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//it will compare value..
		System.out.println(s1.equals(s2));//it will compare memory address....
		System.out.println(s1.hashCode());//it is also giving some int code based on content...
		System.out.println(s2.hashCode());
	}
}
