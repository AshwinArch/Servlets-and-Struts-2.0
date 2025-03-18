package class3;

import java.util.Date;
import java.util.Calendar;

/*Calendar calci & currency format.....*/
public class A02
{
	public static void main(String[] args)
	{
//  	Calendar calci1=Calendar.getInstance();
//		Date d2=calci1.getTime();
//		System.out.println(d2);
	
		Calendar calci1=Calendar.getInstance();
		calci1.add(Calendar.DATE, 2);
		Date d2=calci1.getTime();
		System.out.println(d2);
		
		calci1.roll(Calendar.DATE, 7);
		d2=calci1.getTime();
		System.out.println(d2);
		
		calci1.add(Calendar.DAY_OF_MONTH, 2);
		d2=calci1.getTime();
		System.out.println(d2);
		
		calci1.add(Calendar.DAY_OF_WEEK, 2);
		d2=calci1.getTime();
		System.out.println(d2);
		
		calci1.add(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
		d2=calci1.getTime();
		System.out.println(d2);
		
		calci1.add(Calendar.DAY_OF_YEAR, 2);
		d2=calci1.getTime();
		System.out.println(d2);
		
		Calendar calci11=Calendar.getInstance();
		calci11.add(Calendar.DATE, -1);
		Date d3=calci11.getTime();
		System.out.println(d3);
		
		calci11.roll(Calendar.MONTH, 2);
		d3=calci11.getTime();
		System.out.println(d3);
		
		calci11.add(Calendar.YEAR, 2);
		d3=calci11.getTime();
		System.out.println(d3);
		
		calci11.roll(Calendar.MONTH, -4);
		d3=calci11.getTime();
		System.out.println(d3);
	}
}
