package arrays;

public class D 
{
public static void main(String[] args)
{
	int []all=null;//Declared
	all=new int[10];//define
	for(int i=0;i<all.length;i++)//intialization
	{
		all[i]=i;
	}
	for(int i:all)
	{
		System.out.println(i);
	}
		
}
}
//foreachfor loop we can iterate all elements....