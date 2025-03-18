package class2;
import java.util.Arrays;
class Book implements Comparable
{
	int pages;
	Book(int pages)
	{
		this.pages=pages;
	}
	public String toString()
	{
		return "Pages : "+pages;
	}
	public int compareTo(Object obj)
	{
		return pages-((Book)obj).pages;
	}
}
public class A11
{
	public static void main(String[] args)
	{
		Book all[]=new Book[]{new Book(100), new Book(20), new Book(10), new Book(75)};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
		System.out.println(all[2].toString());
	}
} 
