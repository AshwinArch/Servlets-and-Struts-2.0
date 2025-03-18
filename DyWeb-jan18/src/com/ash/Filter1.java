package com.ash;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Filter1 implements Filter 
{
  	public void destroy()
	{
		System.out.println("I am Filter1 destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("I am Filter1 doFilter begin");
		chain.doFilter(request, response);
		System.out.println("I am Filter1 doFilter end");
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("I am Filter1 init");
	}
}
