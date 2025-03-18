package com.ash.TwoParam;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Cookie1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("param1");
		String s2=request.getParameter("param2");
		PrintWriter out=response.getWriter();
		out.println(s1);
		out.println(s2);
		Cookie c=new Cookie("param1", s1);
		Cookie c1=new Cookie("param2", s2);
		response.addCookie(c);
		response.addCookie(c1);
		out.println("<form action='c2' method='get'><br>");
		out.println("Param3 : <input type='text' name='param3'><br>");
		out.println("Param4 : <input type='text' name='param4'><br>");
		out.println("<input type='submit' value='submit'></form>");
	}
}