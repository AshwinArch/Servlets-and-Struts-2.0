package com.session;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class AttributeManagementListeners
  */
public class AttributeManagementListeners implements HttpSessionAttributeListener, ServletRequestAttributeListener {
    /**
     * Default constructor. 
     */
    public AttributeManagementListeners() {
        // TODO Auto-generated constructor stub
    }
	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        System.out.println("Session Removed");// TODO Auto-generated method stub
    }
	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0) {
       System.out.println("Session Added"); // TODO Auto-generated method stub
    }
	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        System.out.println("Session Replaced");// TODO Auto-generated method stub
    }
	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
      System.out.println("Request Removed"); // TODO Auto-generated method stub
    }
	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
    	System.out.println("Request Replaced");
        // TODO Auto-generated method stub
    }
	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
    	System.out.println("Request Added");
        // TODO Auto-generated method stub
    }
}
