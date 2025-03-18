package class1;

public class A08
{
	public static void main(String[] args)
	{
		String s1="abc";
		System.out.println(s1);
		
		String s2=" abc 123 ";
		System.out.println(s2);
		
		String s3=s2.trim();
		System.out.println(s3);
		System.out.println(s3.length());
		
		System.out.println(s2.length());
		
		String s4="null";
		System.out.println(s4.length());
		
	//	String s5=null;
	//	System.out.println(s5.length());
		
		String s6="";
		System.out.println(s6.length());
		
		String s7="abc@123.com";
		char c1=s7.charAt(3);
		System.out.println(c1);
//		System.out.println(s7.length());
		
		char c2=s7.charAt(5);
		System.out.println(c2);
		
//		char c3=s7.charAt(20);
//		System.out.println(c3);
		
		String s8="abc@xyz.com";
		System.out.println(s8.indexOf("@"));
		
		int i=s8.indexOf("@");
		System.out.println(i);
		
		int j=s7.indexOf('2');
		System.out.println(j);
		
		int k=s8.indexOf("y");
		System.out.println(i);
		
		int a=s8.indexOf("com");
		System.out.println(a);
		
		a=s8.indexOf("con");
		System.out.println(a);
		
		String s9="xyz@xyz.com";
		i=s9.indexOf('x',2);
		System.out.println(i);
		
		i=s9.indexOf('x',2);
		System.out.println(i);
		
		i=s9.lastIndexOf('x',3);
		System.out.println(i);////it will look from right to left and starting index will be 3rd one :-@

		String s12="abc;xyz;123;mno";
		String all[]=s12.split(";");
		for(String s21:all)
		{
			System.out.println(s21);
		}
		
		String s13="java technologies";
		String s14=s13.substring(0,4);
		String s15=s13.substring(5,s13.length());
		System.out.println(s14);
		System.out.println(s15);
		
		String s16="aBc";
		String s17=s16.toUpperCase();
		System.out.println(s17);
		String s18=s17.toLowerCase();
		System.out.println(s18);
	}
}
