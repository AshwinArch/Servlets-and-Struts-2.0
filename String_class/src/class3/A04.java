package class3;

import java.text.NumberFormat;
import java.util.Locale;

public class A04
{
	public static void main(String[] args)
	{
		double d1=12346767.898989;
		NumberFormat n1=NumberFormat.getInstance(Locale.US);
		String s1=n1.format(d1);
		System.out.println(s1);
		
		 n1=NumberFormat.getInstance(Locale.GERMAN);
		 s1=n1.format(d1);
		System.out.println(s1);
		
		 n1=NumberFormat.getInstance(Locale.CANADA);
		 s1=n1.format(d1);
		System.out.println(s1);
		
		 n1=NumberFormat.getInstance(Locale.CHINA);
		 s1=n1.format(d1);
		System.out.println(s1);
		
		 n1=NumberFormat.getInstance(Locale.FRANCE);
		 s1=n1.format(d1);
		System.out.println(s1);
		
		 n1=NumberFormat.getInstance(Locale.ITALY);
		 s1=n1.format(d1);
		System.out.println(s1);
	}
}
