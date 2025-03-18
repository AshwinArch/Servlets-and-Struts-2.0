package class2;
import java.util.Arrays;
public class A10
{
	public static void main(String[] args)
	{
		Person all[]= new Person[4];
		all[0]=new Person(25, 60.08);
		all[1]=new Person(15, 60.08);
		all[2]=new Person(35, 50.00);
		all[3]=new Person(13, 67.08);
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
	}
}

class Person implements Comparable
{
	int age;
	double weight;
	Person(int age, double weight)
	{
		this.age=age;
		this.weight=weight;
	}
	public int compareTo(Object obj)
	{
		return ((Person)obj).age-age;
	}
	public String toString()
	{
		return "Age : "+ age+" & Weight : "+weight+" / ";
	}
}
