package compartor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class ReadFile 
{
public static void main(String[] args) 
{
try
{
		File x1=new File("MyText.txt");
		FileReader x2= new FileReader(x1);
		BufferedReader x4=new BufferedReader(x2);
		String x3=null;
		while((x3=x4. readLine())!=null)
		{
		System.out.println(x3);
		}
      x4.close();
	}
	catch(Exception ex)
	{
	ex.printStackTrace();
	}
}
}