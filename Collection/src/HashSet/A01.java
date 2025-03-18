package HashSet;

import java.util.HashSet;

public class A01
{
	public static void main(String[] args)
	{
		HashSet a=new HashSet();
		a.add(90);
	//	a.add(90.06);
	    a.add(900);
	    System.out.println(a.add(900));         //// if already exist then it will give false...
	    System.out.println(a.add(9045340));           /// if not then give true.......
	}
}
