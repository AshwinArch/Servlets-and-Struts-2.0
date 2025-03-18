package com.headers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet11
 */
public class Servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int i=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		response.setContentType("application/vnd.ms-excel");
		response.setContentType("text/plain");
		PrintWriter out=response.getWriter();
/*		out.println("<b> HelloToAll<b>");
		out.println("<b> HelloToAll<b>");
		out.println("<b> HelloToAll<b>");
		out.println("<b> HelloToAll<b>");
		out.println("<b> HelloToAll<b>");
	*/
		out.println(i++);
		response.setIntHeader("refresh",1);
//		response.setIntHeader("refresh", 0);
//		response.setIntHeader("refresh", 2);
		out.close();
	}


}
