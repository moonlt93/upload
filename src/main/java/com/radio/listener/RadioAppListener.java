package com.radio.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class RadioAppListener
 *
 */
public class RadioAppListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public RadioAppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
        ServletContext app = sce.getServletContext();
        String contextRoot = app.getContextPath(); 
        
		String staticPath= "https://objectstorage.ap-seoul-1.oraclecloud.com/n/cnca7kbvyqaq/b/bucket-20210216-1417/o/";

		app.setAttribute("root", contextRoot);
		app.setAttribute("staticPath", staticPath);
        
        app.setAttribute("root", contextRoot);
    }
	
}
