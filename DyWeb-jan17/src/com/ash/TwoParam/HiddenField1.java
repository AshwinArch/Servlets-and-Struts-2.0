package com.ash.TwoParam;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HiddenField1 extends HttpServlet
 {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String s1=request.getParameter("param1");
		String s2=request.getParameter("param2");
		PrintWriter out=response.getWriter();
		out.println(s1+"<br>");
		out.println(s2);
		out.println("<form action='hf2' method='post'>");
		out.println("<input type='hidden' name='param1' value='"+s1+"'><br>");
		out.println("<input type='hidden' name='param2' value='"+s2+"'><br>");
		out.println("param3: <input type='text' name='param3'><br>");
		out.println("param4: <input type='text' name='param4'><br>");
		out.println("<input type='submit' value='submit' ></form>");
	}
}
