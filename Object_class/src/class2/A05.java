package class2;

class G
{
	int i;
	double j;
	G(int i, double j)
	{                                                                      //i = 10 , j = 200.0
		this.i=i;															//	i = 10 , j = 200.0
		this.j=j;																//	true
	}
	public String toString()
	{
		return "i = "+i+" , j = "+j;
	}
	public boolean equals(Object obj)
	{
		G g=(G) obj;
		return i==g.i && j==g.j;
	}
}
public class A05
{
	public static void main(String[] args)
	{
		G g1=new G(10,200.0);
		G g2=new G(10,200.0);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g1.equals(g2));
	}
}