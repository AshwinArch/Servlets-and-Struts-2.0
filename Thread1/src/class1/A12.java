package class1;


public class A12
{
	public static void main(String[] args)
	{	
		Runnable r=new Runnable()
							{
								public void run()
								{
									for(int i=0;i<1000;i++)
									{
										System.out.println(i);
									}
								}
							};
		Thread t=new Thread(r);
		t.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}		
							
	}
}
