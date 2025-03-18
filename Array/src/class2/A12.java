package class2;

import java.util.Arrays;

class E implements Comparable
{
	int i,j;
	E(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "i : "+i+" & j : "+j+" / ";
	}
	public int compareTo(Object obj)
	{
		return j-((E)obj).j;
	}
}
public class A12
{
	public static void main(String[] args)
	{
		E all[]=new E[]{new E(1,2), new E(10,5), new E(5,30), new E(3,3)};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}
} 
