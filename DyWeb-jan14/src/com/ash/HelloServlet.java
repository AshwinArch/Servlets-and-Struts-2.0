package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet 
{
		private static final long serialVersionUID = 1L;
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
//			String s1=request.getParameter("param5");
			String s1=request.getParameter("param1");
			PrintWriter out=response.getWriter();
			out.println("param1 : "+s1+"<br>");
			System.out.println(s1);
			out.close();
		}
}
