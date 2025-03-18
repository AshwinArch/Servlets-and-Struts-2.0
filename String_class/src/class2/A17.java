package class2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Regular Expression*/

public class A17
{
	public static void main(String[] args)
	{//				   0123456789
		String src="a1b2c3";
//		String src="java 1.5 is a tiger version & introduced in 1990";
		String exp="[1-3]";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(src);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
