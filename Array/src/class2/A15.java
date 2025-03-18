package class2;
import java.util.Arrays;
import java.util.Comparator;
class E1
{
	int i,j;
	E1(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "i : "+i+" & j : "+j;
	}
}
class I implements Comparator
{
	public int  compare(Object o1, Object o2)
	{
		E1 e1=(E1)o1;
		E1 e2=(E1)o2;
		return e1.i-e2.i;
	}
}
class J implements Comparator
{
	public int  compare(Object o1, Object o2)
	{
		E1 e1=(E1)o1;
		E1 e2=(E1)o2;
		return e1.j-e2.j;
	}
}
public class A15
{
	public static void main(String[] args)
	{
		E1 all[]={new E1(12, 1), new E1(72, 30), new E1(82, 40), new E1(52, 51), new E1(32, 55), new E1(55, 16)};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all, new I());
		System.out.println(Arrays.toString(all));
		Arrays.sort(all,new  J());
		System.out.println(Arrays.toString(all));
	}
}
