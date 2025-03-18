class A0
{
	 final int i;
   	 static 
	 {   
   		 System.out.println("This is A's SIB");
	 }
   	 void test1()
  	 {
    		System.out.println("i value in A"+i);
    		System.out.println("This is in test1()");
   	 }
}
class B0 extends A0
{     
	  int j;
	  void test1() 
	   {
	   super.test1();
	  System.out.println("This is in B's  test1()");
	 }
void test2()
  {
		j= i + 100;
		System.out.println("j in B class j = i+100" +j);
		System.out.println("This is in test2()");
 }
	  	static 
	 	{ 
			   		System.out.println("This is B's SIB");
	 	}
}
public class Final 
{
	public static void main(String[] args) 
	{
				B0 b = new B0();
				b.test1();
				b.test2();
	}
}
