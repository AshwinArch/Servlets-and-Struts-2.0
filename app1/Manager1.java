class Manager1
{
	public static void main(String[] args) 
	{
		int i;
		test((i = 10) * 25);
	}
	static void test(int i)
	{
		System.out.println(i);
	}
}
