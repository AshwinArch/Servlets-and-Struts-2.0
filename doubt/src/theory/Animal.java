package theory;
import java.util.ArrayList;
public class Animal
{
	public void go()
	{
		ArrayList<dog> alist = new ArrayList<dog>();
		takelist(alist);
	}
	public void takelist(ArrayList<Object> list){}
}
class dog extends Animal
{}