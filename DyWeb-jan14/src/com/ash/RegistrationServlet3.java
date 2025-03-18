package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet3 extends HttpServlet 
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
	protected void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String params=request.getQueryString();
		out.println("QueryString :"+params+"<br>");
		if(params!=null)
		{
			String namevalues[]=params.split("&");
			String name, value;
			for(String namevalue:namevalues)
			{
				name=namevalue.substring(0, namevalue.indexOf('='));
				value=namevalue.substring(namevalue.indexOf('=')+1);
				out.println(name+" : "+value+"<br>");
			}
		}
		out.close();
	}
}