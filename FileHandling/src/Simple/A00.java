package Simple;
import java.io.File;
import java.io.IOException;
/**
 * @author Ashwin
 *							we are just creating simple file blank.....
 */
public class A00
{
	public static void main(String[] args)
	{
		File file=new File("test.txt");
		try
		{
			boolean flag=file.createNewFile();
			System.out.println(flag);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
