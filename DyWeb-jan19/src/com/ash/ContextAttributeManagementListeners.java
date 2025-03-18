package com.ash;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class ContextAttributeManagementListeners
 *
 */
public class ContextAttributeManagementListeners implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextAttributeManagementListeners() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        System.out.println("Context Added");// TODO Auto-generated method stub
    }
	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("Context Replaced");// TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
    	System.out.println("Context Removed");// TODO Auto-generated method stub
    }
}
