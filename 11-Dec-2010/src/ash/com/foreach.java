package ash.com;

public class foreach 
{
	
	public static void main(String[] args) {
	int all[] = {10, 20, 22, 39, 40};
	for(int i: all)
	{
		System.out.println(i);			
	}
	for(int j=0;j<all.length;j++)
	{
		System.out.println(all[j]);			
	}
	String all1[]={"abc","xyz","123"};
	for(String str : all1)
	System.out.println(str);	
}
}