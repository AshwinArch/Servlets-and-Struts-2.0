/**
 * 
 */
package doubt2;

/**
 * @author Ashwin
 *
 */
class A
{
	public static void test()
	{
	}
}
class Manager
{
	public static void main(String[] args) 
{
		 A a1=new A()
		 {
			 public void test()
			 {		
				 System.out.println("A-type");
			 }
		 };
	}
}


