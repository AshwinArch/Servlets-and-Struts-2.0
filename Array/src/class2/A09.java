package class2;
import java.util.Arrays;
public class A09
{
	public static void main(String[] args)
	{
		C all[]=new C[4];
		all[0]=new C(90);
		all[1]=new C(10);
		all[2]=new C(30);
		all[3]=new C(20);
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}
}
class C implements Comparable
{
	int i;
	C(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i= "+i;
	}
	public int compareTo(Object obj)
	{
		return i-((C)obj).i	;	
	}
}
