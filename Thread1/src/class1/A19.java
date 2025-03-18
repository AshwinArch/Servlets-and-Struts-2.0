package class1;
class A19 extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class Manager
{
	public static void main(String[] args)
	{
		A19 a1=new A19();
		a1.start();
		a1.run();
	}
}
