package class3;

import java.util.Date;

/*date time format*/
public class A00
{
	public static void main(String[] args)
	{
/*		Date d=new Date();                                                                //Sat Dec 25 20:47:16 GMT+05:30 2010
          		System.out.println(d);                                                     ////1293290236607
          System.out.println(d.getTime());                                                                                  
*/
		Date d=new Date();
		Date d1=new Date(d.getTime()+(60*60*1000*24));
		System.out.println(d);
		System.out.println(d1);
		Date d2=new Date(d.getTime()-(60*60*1000*24));
		System.out.println(d2);
		System.out.println(d.getTime());
		System.out.println(d1.getTime());
		System.out.println(d2.getTime());
		System.out.forma(d2.getTime());
		
	
	}
}
