package class1;
class J
{
	int i;
	@Override
	public String toString()
	{
		return "This is j reference variable\n"+"and is refering to "+super.toString()+"\n"+"content as follows : i =" +i;
	}
}
public class A10
{
	public static void main(String[] args)
	{
	J j1=new J();
	j1.i=1000;
	System.out.println(j1);
	}
}
