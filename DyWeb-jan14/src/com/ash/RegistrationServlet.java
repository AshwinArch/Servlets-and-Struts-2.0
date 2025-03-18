package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPerform(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPerform(request, response);
	}
	@SuppressWarnings("unchecked")
	protected void doPerform(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
	{
		Enumeration<String> names=request.getParameterNames();
		String name, values[];
		PrintWriter out=response.getWriter();
		while(names.hasMoreElements())
		{
			name=names.nextElement();
			values=request.getParameterValues(name);
			out.println(name +":"+Arrays.toString(values)+"<br>");
		}
		out.close();
	}
}
