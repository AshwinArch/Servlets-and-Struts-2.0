/**
 * 
 */
package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class AppLifeCyclelistener implements ServletContextListener
{
	public void contextDestroyed(ServletContextEvent arg0)
	{
		System.out.println("Context Destroyed");
	}
	public void contextInitialized(ServletContextEvent arg0)
	{
		System.out.println("Context Initialized");
	}
}
