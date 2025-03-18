package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A03
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(new A(10));
		list.add(new A(90));
		list.add(new A(20));
		list.add(new A(70));
		System.out.println(list);
/*		Collections.sort(list);                            these statement are never work until { class A implements comparable } 
		System.out.println(list);                         b'coz derived Data have to implements comparable for using Collections.sort */
	}
}
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i = "+i;
	}
}