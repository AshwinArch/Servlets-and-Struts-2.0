package class1;

class Manager3 extends Thread
{
	
	public void start()
	{
		System.out.println("Start");
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class A00
{
	public static void main(String[] args)
	{
		Manager3 a1=new Manager3();
		a1.start();
	}
}



