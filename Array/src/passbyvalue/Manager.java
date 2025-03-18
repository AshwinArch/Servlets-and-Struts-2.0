
package passbyvalue;

public class Manager {
public static void main(String[] args) {
	Object all[]=new Object[5];
	all[0]=new Object();
	all[1]="xyz";
	all[2]=new Manager();
	all[3]=2;
	all[4]=0;
	System.out.println("done");
}
}
