package ash.com;

class Pro22 extends Thread
{}
class Manager11
{
	public static void main(String[] args)
	{
		Pro22 p1=new Pro22();
		p1.start();
		p1.run();
	}
}
