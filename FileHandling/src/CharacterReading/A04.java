/**
 * 
 */
package CharacterReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ashwin
 *      buffer reader
 */
public class A04
{
	public static void main(String[] args)
	{
		File file=new File("test1.txt");
		FileReader in=null;
		BufferedReader bin=null;
		try
		{
			in=new FileReader(file);
			bin=new BufferedReader(in);
			String s1=bin.readLine();
			while(s1!=null)
			{
				System.out.println(s1);
				s1=bin.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(bin!=null)
				{
					bin.close();
					bin=null;
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(in!=null)
				{
					in.close();
					in=null;
				}
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
