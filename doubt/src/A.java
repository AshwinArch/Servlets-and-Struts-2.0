class G
{
	int i;
	static int j=2;
	{
		i=10;
		j=20;
		k=30;
		l=40;
	}
	int k=3;
	static 
	{
		j=4;
		l=5;
		
	}
	static int l;
}
class H extends G
{
	static int m;
	int n=6;
	H()
	{
		m=60;
		n=70;
		r=45;
	}
	int r=22;
	{
		m=44;
		r=66;
		i=77;
	}
	static 
	{
		m=33;
		j=34;
		s=200;
	}
	static int s=12;
}
class I extends H
{
	static int p;
	int q=3000;
	I(int i)
	{
		this.i=i;
		q=i*i;
	}
	static 
	{
		//p = i * j ;
	}
	{
		p=1200;
		q=15;
		t=8;
	}
	static int t=18;
}
class Manager
{
	public static void main(String[] args)
	{
		G g1=new G();
		H h1=new H();
		I i1=new I(35);
		System.out.println(g1.i);
		System.out.println(g1.j);
		System.out.println(g1.k);
		System.out.println(g1.l);
		System.out.println(h1.m);
		System.out.println(h1.n);
		System.out.println(h1.r);
		System.out.println(h1.s);
	//	System.out.println(i1.p);
		System.out.println(i1.q);
		System.out.println(i1.t);
	}
}