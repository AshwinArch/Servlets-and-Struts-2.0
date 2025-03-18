package com.ash;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLifeCycleListener implements ServletRequestListener 
{
	public void requestDestroyed(ServletRequestEvent arg0) 
    {
        System.out.println("Request Destroyed");
    }
    public void requestInitialized(ServletRequestEvent arg0) 
    {
        System.out.println("Request Initialized");
    }
}
