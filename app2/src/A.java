class A
{
	int i=10;
		int j = 20;
	static void swap()
	{
		A a1 = new A();
		a1.i = ( a1.i + a1.j );
		a1.j = a1.i - a1.j;
		a1.i = a1.i - a1.j;
		System.out.println(a1.i);	
		System.out.println(a1.j);	
	}
	public static void main(String[] args)
		{
		swap();
			}
}