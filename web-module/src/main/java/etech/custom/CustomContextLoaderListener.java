package etech.custom;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.ContextLoaderListener;

@WebListener
public class CustomContextLoaderListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		
		event.getServletContext().setInitParameter("contextConfigLocation", "WEB-INF/app-context.xml");
		event.getServletContext().setInitParameter("javax.faces.FACELETS_LIBRARIES", "WEB-INF/springsecurity.taglib.xml");
		event.getServletContext().setInitParameter("javax.faces.CONFIG_FILES", "WEB-INF/faces-config.xml");
		
        initWebApplicationContext(event.getServletContext());
		
	}
	
}
