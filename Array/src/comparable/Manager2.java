package comparable;

import java.util.Arrays;

class Person implements Comparable
{
	int age;
	double weight;
	Person(int age,double weight)
	{
		this.age=age;
		this.weight=weight;
	}
	public String toString()
	{
		return age+":"+weight;
	}
	public int compareTo(Object obj)
	{
		return age-((Person)obj).age;
	}
}
public class Manager2 
{
public static void main(String[] args) 
{
	Person p1=new Person(23, 50.08);
	Person p2=new Person(36, 80.08); 
	Person p3=new Person(25, 60.08);
	Person p4=new Person(34, 35.03);
	Person all[]={p1,p2,p3,p4};
	System.out.println(Arrays.toString(all));
	Arrays.sort(all);
	System.out.println(Arrays.toString(all));
	}
}
//op:
//[23:50.08, 36:80.08, 25:60.08, 34:35.03]
//[23:50.08, 25:60.08, 34:35.03, 36:80.08]
//comparable its only for one object wise...
//inside a comparable method we can implement compareTo method....