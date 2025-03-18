package class3;

public class A00
{
	/*	public static void main(String[] args)throws CloneNotSupportedException
	{
		A00 z1=new A00();
		A00 z2=(A00)z1.clone();			
										*/
	public static void main(String[] args)
	{
		A00 all[]=new A00[87450074];
		for(int i=0;i<all.length;i++)
		{
			all[i]=new A00();
		}
/*		A00 z1=new A00();
	try
		{
			A00 z2=(A00)z1.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("handled");
*/
//		String s1=null;
//		System.out.println(s1.length());
		
	}
}
//it will show CloneNotSupportedException...........