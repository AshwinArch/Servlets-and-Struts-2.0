package class1;
class G
{
	int i,j;
	@Override
	public String toString()
	{
		return "i = "+i+",j = "+j;
	}
}
public class A07
{
	public static void main(String[] args)
	{
		G g1=new G();
		g1.i=100;
		g1.j=200;
		System.out.println(g1);
	}
}
