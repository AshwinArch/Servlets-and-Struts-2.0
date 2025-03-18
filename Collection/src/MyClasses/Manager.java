/**
 * 
 */
package MyClasses;

/**
 * @author Ashwin
 *
 */
public class Manager
{
	public static void main(String[] args)
	{
		MyArraylist list=new MyArraylist();
		list.add(10);
		list.add(120);
		list.add(50);
		list.add("abc");
		list.add(500);
		list.add(200.0);
		list.add("xyz");
		System.out.println(list.get(3));
		System.out.println(list);
		System.out.println(list.Size());
	}
}
