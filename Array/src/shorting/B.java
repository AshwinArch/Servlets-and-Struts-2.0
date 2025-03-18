package shorting;

public class B {
public static void main(String[] args) {
	long l1[]=new long[10];
	l1[1]=1;
	l1[2]=2;
	l1[3]=3;
	l1[4]=4;
	l1[5]=5;
	l1[6]=6;
	l1[7]=7;
	l1[8]=8;
	l1[9]=9;
	//l1[10]=11;AIOBE
	//simple for loop
	/*for(int i=0;i<l1.length;i++)
	{
		System.out.println(l1[i]);
	}*/
	for(float f : l1)
	{
		System.out.println(f);//Enhanced for loop
	}
}
}
/*0
1
2
3
4
5
6
7
8
9
*/