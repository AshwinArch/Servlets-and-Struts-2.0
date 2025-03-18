package class1;

class Threadx implements Runnable
{
	private Runnable r1;
	Threadx(Runnable r1)
	{
		this.r1=r1;
	}
	public void run()
	{
		if(r1!=null)
		{
			r1.run();
		}
	}
}
