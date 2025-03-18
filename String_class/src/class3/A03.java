package class3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class A03
{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		Date d1=c.getTime();
		DateFormat df1=DateFormat.getDateInstance();
		String s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		d1=c.getTime();
		df1=DateFormat.getDateInstance(DateFormat.SHORT);
		s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		d1=c.getTime();
		df1=DateFormat.getDateInstance(DateFormat.DEFAULT);
		s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		d1=c.getTime();
		df1=DateFormat.getDateInstance(DateFormat.MEDIUM);
		s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		d1=c.getTime();
		df1=DateFormat.getDateInstance(DateFormat.FULL);
		s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		d1=c.getTime();
		df1=DateFormat.getDateInstance(DateFormat.LONG);
		s1=df1.format(d1);
		System.out.println(d1);
		System.out.println(s1);
		
		 DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA);
		 s1=df.format(d1);
		 System.out.println(d1);
		 System.out.println(s1);
		 
	}
}
