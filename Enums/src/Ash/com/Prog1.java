package Ash.com;

enum Month
{
	JAN(31),FEB(28);
	private Month(int i)
	{
		System.out.println(this+" : "+i);
	}

}
class Manager2
{
	public static void main(String[] args)
	{
		Month m1=Month.JAN;
	}	
}