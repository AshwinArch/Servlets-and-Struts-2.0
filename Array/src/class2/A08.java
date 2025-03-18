package class2;
import java.util.Arrays;
public class A08
{
	public static void main(String[] args)
	{
		B all[]=new B[3];
		B b1=new B();		b1.i=10;
		B b2=new B();		b2.i=100;
		B b3=new B();		b3.i=1000;
		all[0]=b1;         all[1]=b2;            all[2]=b3;
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}
}
class B 
{
	int i;
	public String toString()
	{
		return "i = "+i;
	}
}