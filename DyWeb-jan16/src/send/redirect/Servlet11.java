package send.redirect;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet11 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("param1");
		System.out.println(s1);
		PrintWriter out=response.getWriter();
		out.println("from s1:"+s1+"<br>");
		String s2=new StringBuffer(s1).reverse().toString();
		request.setAttribute("result", s2);
		response.sendRedirect("s12");
		System.out.println("end of servlet11");
	}
}
