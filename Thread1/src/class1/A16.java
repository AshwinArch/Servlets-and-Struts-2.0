package class1;
class A16 extends Thread
{	
	A16()
	{
		start();
	}
	public static void main(String[] args)
	{
		A16 P1=new A16();
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}						
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
