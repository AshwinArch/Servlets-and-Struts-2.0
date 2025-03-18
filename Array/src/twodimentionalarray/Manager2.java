package twodimentionalarray;

public class Manager2 {
	public static void main(String[] args) {
		int all[][] = new int[3][];
		all[0] = new int[2];
		all[1] = new int[0];
		all[2] = new int[3];
		System.out.println(all[0][1]);// 0
		System.out.println(all[1][0]);//ArrayIndexOutOfBoundsException
	}
}
//array size always should be declare +ve
//array size always should be declare integer
//array size should not be Declared -ve number