package arrays;
public class C 
{
public static void main(String[] args) 
{
	int all[]=new int[3];
	int x[]=new int[3];
	System.out.println(all);//op:[I@1888759
	System.out.println(x);//op:[I@6e1408
	System.out.println(all==x);//false
	System.out.println(all.equals(x));//false
	all[0]=x[0]=10;
	all[1]=x[1]=20;
	all[2]=x[2]=30;
	System.out.println(all.equals(x));//f
	System.out.println(all==x);//f
	System.out.println(all[0]);//10
	System.out.println(all[1]);//20
	System.out.println(all[2]);//30
	System.out.println(x[0]);//10
	System.out.println(x[1]);//20
	System.out.println(x[2]);//30
}
}
//[I -->this is class which is developed by sun developers
//inside arrays tostring method only override
//inside arrays equals,hashcode method are not override-
/*
[I@1888759
[I@6e1408
false
false
false
false
10
20
30
10
20
30*/