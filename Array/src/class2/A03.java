package class2;
public class A03
{
	public static void main(String[] args)
	{
		int all[]=new int[3];
		Object obj=all;
//		System.out.println(obj[0]);
		System.out.println(all[0]);
		int x[]=(int [])obj;
		System.out.println(x[0]);
		x[1]=100;
		System.out.println(all[1]);
		x[2]=150;
		System.out.println(all[2]);
		
	}
}
