package com.ash;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Filter3 implements Filter
{
   	public void destroy() 
	{
		System.out.println("Filter3-Destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("doFilter3-begin");
		chain.doFilter(request, response);
		System.out.println("doFilter3-end");
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("Filter3-init");
	}
}
