package ash.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DiffInputsServlet
 */
public class DiffInputsServlet extends HttpServlet 
{private static final long serialVersionUID = 1L;
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
				String s1=request.getParameter("param1");
				ServletConfig config=getServletConfig();
				ServletContext context=getServletContext();
				String s2=config.getInitParameter("param2");
				String s3=context.getInitParameter("param3");
				PrintWriter out=response.getWriter();
				out.println("param1:"+s1+"<br>");
				out.println("param2:"+s2+"<br>");
				out.println("param3:"+s3+"<br>");
				out.close();	
		}
}
