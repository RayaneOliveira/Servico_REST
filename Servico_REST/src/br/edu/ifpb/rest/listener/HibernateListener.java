package br.edu.ifpb.rest.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.edu.ifpb.rest.util.HibernateUtil;

public class HibernateListener implements ServletContextListener {  
	  
    public void contextInitialized(ServletContextEvent event) {  
        HibernateUtil.getSessionFactory(); 
    }  
  
    public void contextDestroyed(ServletContextEvent event) {  
    	HibernateUtil.getSessionFactory().close();
    }  
}