package com.bxtel;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
public class MyServletContextListener implements ServletContextListener,ServletRequestListener {
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		MyServletContextHolder.setServletContext(null);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		MyServletContextHolder.setServletContext(arg0.getServletContext());
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		
	}
	
}
