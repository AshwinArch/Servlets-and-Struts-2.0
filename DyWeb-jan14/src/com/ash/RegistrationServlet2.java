package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet2 extends HttpServlet 
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
	protected void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		Map<String, String[]> params=request.getParameterMap();
		Iterator<String> keys=params.keySet().iterator();
		String name, values[];
		PrintWriter out=response.getWriter();
		while(keys.hasNext())
		{
			name=keys.next();
			values=params.get(name);
			out.println(name+" : "+Arrays.toString(values)+"<br>");
		}
		out.close();
	}
}
