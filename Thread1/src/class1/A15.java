package class1;

public class A15
{
	
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
		Thread t1=new Thread(new Runnable()
						{
							public void run()
							{
								for(int i=0;i<1000;i++)
								{
									System.out.println(i);
								}
							}
						});
		
			t1.start();
		}
	}
}
