package class1;


public class A09
{
	public static void main(String[] args)
	{
		Thread t=new Thread()
						{
							public void run()
							{
								for(int i=0;i<1000;i++)
								{
									System.out.println(i);
								}
							}
						};
		t.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
