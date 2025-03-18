package comparable;

import java.util.Arrays;

class B implements Comparable
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i=" +i;
	}
	public int compareTo(Object o)
	{
		B b=(B)o;
		return i-b.i;
	}
}
public class Manager1 {
public static void main(String[] args) {
	B all[]={new B(10),new B(2),new B(30),new B(0),new B(0),new B(4),new B(5)};
	Arrays.sort(all);
	System.out.println(Arrays.toString(all)); 
}
}
//-->comparable is a interface which is there in java.lang.package......
//-->in order to sort any data type that can be implements comparable...
//-->all wrapper class,String class all ready implemented interface.....
//-->condition in order to sort derived data type......
//-->implements comparable interface,inside interface there is no null element....
//-->internally comparable method it can be doing sorting......
//-->inside a comparable interface compareTo method are implemented....
