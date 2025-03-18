package Simple;
import java.io.File;
/**
 * @author Ashwin
 *   it will create all folder/directory and give true if drive is existing.....
 */
public class A06
{
	public static void main(String[] args)
	{
		File f=new File("E:/A/B/C");
		System.out.println(f.mkdirs());
	}
}
