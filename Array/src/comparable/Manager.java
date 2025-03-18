package comparable;

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
		return "i="+i;
	}
}
public class Manager {
public static void main(String[] args) {
	A all[]={new A(10),new A(5),new A(3),new A(4),new A(11),new A(9)};
	Arrays.sort(all);
	System.out.println(Arrays.toString(all));
}
}
//we are unable to sort array class A we will get CCE[ClassCastException].......
//we unable to sort array which contain user Define data type...
//we  able to sort any kind of primitive object we are getting CCE....