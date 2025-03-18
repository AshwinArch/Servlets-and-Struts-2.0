package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Filter4 implements Filter
{
	FilterConfig config=null;
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		ServletContext context=config.getServletContext();
		PrintWriter out=response.getWriter();
		String c1=config.getInitParameter("p1");
		String c2=config.getInitParameter("p2");
		String c3=context.getInitParameter("p3");
		out.println(c1+"<br>");
		out.println(c2+"<br>");
		out.println(c3+"<br>");
		chain.doFilter(request, response);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
	public void init(FilterConfig fConfig) throws ServletException
	{
		config=fConfig;
		System.out.println(config);
	}
	public void destroy()
	{
		
	}
}
