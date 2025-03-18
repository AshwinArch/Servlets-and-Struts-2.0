package states;

public class A00
{
	public static void main(String[] args)
	{
		Thread.State states[]=Thread.State.values();
		for(Thread.State state:states)
		{
			System.out.println(state);
		}
	}
	
}
// it will show all states of threads.
