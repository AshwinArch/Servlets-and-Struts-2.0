package class2;

public class A12
{
	public static void main(String[] args)
	{
		String s1=new String("abc");
		String s2=new String("abC");
		Integer i1=new Integer(120);
		Integer i2=new Integer(120);
		System.out.println(s1.compareTo(s2));    /// it will give difference of ascii values....
		System.out.println(s1.equals(s2));    /// it will consider content...
		System.out.println(s1==s2);         ////it will consider on address value....
		System.out.println(i1.equals(i2));
		System.out.println(s1.equalsIgnoreCase(s2));       //it will compare s1 & s2 without checking case sensitive......
	}
}
