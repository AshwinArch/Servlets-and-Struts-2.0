package class1;

public class A07
{
	public static void main(String[] args)
	{
		String s1="ja";
		String s2="va";
		String s3=new String("ja");
		String s4=new String("va");
		String s5="java";// this will refer same stack string constant pool object as s13..
		String s6=new String("java");
		String s7=s1+s2;
		String s8=s3+s4;
		String s9="ja" +s2;
		String s10=s1+"va";
		String s11=s1+s4;
		String s12=s1.concat(s2);
		String s13="ja"+"va";// this will refer same stack string constant pool object as s5..
		String s14="ja".concat("va");
		String s15=s1.concat(s4);
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		System.out.println(s5==s8);
		System.out.println(s5==s9);
		System.out.println(s5==s10);
		System.out.println(s5==s11);
		System.out.println(s5==s12);
		System.out.println(s5==s13);
		System.out.println(s5==s14);
		System.out.println(s5==s15);
		
	}
}
//except this one(s5==s13) nowhere we can get true.........