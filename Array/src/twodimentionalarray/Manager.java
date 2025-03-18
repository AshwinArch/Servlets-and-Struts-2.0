package twodimentionalarray;
public class Manager {
public static void main(String[] args) {
	int all[][]=new int[4][2];	
	all[0][0]=10;
	all[0][1]=20;
	all[1][0]=30;
	all[1][1]=40;
	all[2][0]=50;
	all[2][1]=60;
	System.out.println(all[1][2]);//ArrayIndexOutOfBoundsException
	
}
}
