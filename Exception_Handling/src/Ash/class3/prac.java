package Ash.class3;

public class prac
{
	/*	public static void main(String[] args)throws CloneNotSupportedException
	{
		prac z1=new prac();
		prac z2=(prac)z1.clone();			
										*/
	public static void main(String[] args)
	{
		prac all[]=new prac[87450074];
		for(int i=0;i<all.length;i++)
		{
			all[i]=new prac();
		}
/*		prac z1=new prac();
	try
		{
			prac z2=(prac)z1.clone();
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