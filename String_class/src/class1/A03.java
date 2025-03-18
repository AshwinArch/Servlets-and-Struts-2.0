package class1;

public class A03
{
	public static void main(String[] args)
	{
		String s1=new String("abc");
		String s2="abc";
		System.out.println(s1==s2);//it will compare address...
		System.out.println(s1.equals(s2));//it will check content...
		System.out.println(s1.hashCode()==s2.hashCode());//value will be based on contents..
		
	}
}
