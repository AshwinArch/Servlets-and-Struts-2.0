package class2;
import java.util.Arrays;
import java.util.Comparator;
public class A13 
{
	String name;
	int age;
	Double weight;
	A13(String name, int age, Double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public String toString()
	{
		return "Name : "+name+" & Age : "+ age+" & Weight : "+weight+" / ";
	}
}
class SortBasedOnAge implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		A13 p1=(A13) o1;
		A13 p2=(A13) o2;
		return p1.age-p2.age;
	}
}
class SortBasedOnName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		A13 p1=(A13) o1;
		A13 p2=(A13) o2;
		return p1.name.compareTo(p2.name);
	}
}
class SortBasedOnWeight implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		A13 p1=(A13) o1;
		A13 p2=(A13) o2;
		return p1.weight.compareTo(p2.weight);
	}
}