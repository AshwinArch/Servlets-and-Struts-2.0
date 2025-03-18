package class1;
class A18 implements Runnable
{
	A18()
	{
		new Thread(this).start();
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		new A18();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
