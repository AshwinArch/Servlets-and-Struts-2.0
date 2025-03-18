package class1;
class A20 extends Thread
{}
class Manager11
{
	public static void main(String[] args)
	{
		A20 p1=new A20();
		p1.start();
		p1.run();
	}
}