package Ash.class3;

public class prac2
{
	public static void main(String[] args)
	{
		try
		{
			args=null;
			args[0]="test";
			System.out.println(args[0]);
		}
		catch(NullPointerException ex1)
		{
			System.out.println(args.length);
			System.out.println(2);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
//we cant keep null in args otherwise it will show NullPointerException...