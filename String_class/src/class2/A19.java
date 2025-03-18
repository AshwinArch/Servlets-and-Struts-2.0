package class2;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.transform.Source;
/*Regular Expression*/

public class A19
{
	public static void main(String[] args)
	{//				   0123456789
		StringTokenizer src=null;
//		String src="java 1.5 is a tiger version & introduced in 1990";
		src=new StringTokenizer("abc;xyz;hello",";");
//		Pattern p=Pattern.compile(exp);
//		Matcher m=p.matcher(src);
		while (src.hasMoreElements())
		{
			System.out.println(src.nextToken());
			
		}
	}
}
