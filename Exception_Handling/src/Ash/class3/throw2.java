package Ash.class3;

public class throw2
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);
		if (age<=0)
		{
			throw new AgeIsNotLessThenZero("Age should not be less then 0...");
		}
	}
}
class AgeIsNotLessThenZero extends RuntimeException
{
	AgeIsNotLessThenZero()
	{
		
	}
	AgeIsNotLessThenZero(String msg)
	{
		super(msg);
	}
}