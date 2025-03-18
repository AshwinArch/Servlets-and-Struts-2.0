package vol3;
class H
{
	int x;
	H(int n)
	{
		x=n;
	}
}
public class Manager9
{
public static void main(String[] args)
{
	H[] h=new H[14];
	for(int i=0;i<h.length;i++)
	{
		h[i]=new H(i);
		System.out.println(h[i].x+"");
	}
}
}
