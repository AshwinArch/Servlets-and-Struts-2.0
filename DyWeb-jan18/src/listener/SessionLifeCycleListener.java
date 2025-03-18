package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLifeCycleListener implements HttpSessionListener
{
	public void sessionCreated(HttpSessionEvent arg0)
	{
		System.out.println("Session Created");
	}
	public void sessionDestroyed(HttpSessionEvent arg0)
	{
		System.out.println("Session Destroyed");
	}
}
