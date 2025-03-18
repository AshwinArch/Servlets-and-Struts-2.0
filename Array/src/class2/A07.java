package class2;
import java.util.Arrays;
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
public class A07
{
	public static void main(String[] args)
	{
		A all[]={new A(90), new A(07)};
		System.out.println(Arrays.toString(all));
//		Arrays.sort(all);                   // it will show java.lang.ClassCastException
		System.out.println(all);  
		System.out.println(all[1]);  
	}
}
