package class2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.transform.Source;
/*Regular Expression*/

public class A18
{
	public static void main(String[] args)
	{//				   0123456789
		String src="hello;123?xyz{final";
//		String src="java 1.5 is a tiger version & introduced in 1990";
		String all[]=src.split("[;?{]");
//		Pattern p=Pattern.compile(exp);
//		Matcher m=p.matcher(src);
		for(String s:all)
		{
			System.out.println(s);
		}
	}
}
