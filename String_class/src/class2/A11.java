package class2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Regular Expression*/

public class A11
{
	public static void main(String[] args)
	{//				   0123456789
//		String src="ababcabcab";
		String src="java 1.5 is a tiger version";
		String exp="\\w";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(src);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
