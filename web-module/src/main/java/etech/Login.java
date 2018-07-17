package etech;


import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

@ManagedBean(name = "login")
@RequestScoped
public class Login implements PhaseListener {

	private static final long serialVersionUID = 1L;

	public String doLogin() throws ServletException, IOException {
	
		FacesContext currentInstance = FacesContext.getCurrentInstance();
	
		ExternalContext context = currentInstance.getExternalContext();
		
	
		RequestDispatcher dispatcher = ((ServletRequest) context.getRequest())
				.getRequestDispatcher("/j_spring_security_check");
	
		dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
	
		currentInstance.responseComplete();
	
		// UserDetails user = (UserDetails)
		// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// System.out.println(user.getUsername());
	
		return null;
	}

	public String doLogout() throws ServletException, IOException {

		FacesContext currentInstance = FacesContext.getCurrentInstance();

		ExternalContext context = currentInstance.getExternalContext();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			SecurityContextLogoutHandler slgh = new SecurityContextLogoutHandler();
			slgh.logout((HttpServletRequest) context.getRequest(), (HttpServletResponse) context.getResponse(), auth);

		}

		((HttpServletResponse) context.getResponse()).sendRedirect("j_spring_security_logout");
		
		return "login.xhtml";
	}

	public void afterPhase(PhaseEvent event) {}

	public void beforePhase(PhaseEvent event) {
		
		Exception e = (Exception) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(WebAttributes.AUTHENTICATION_EXCEPTION);

		if (e instanceof BadCredentialsException) {

			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
			
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username or password not valid.", "Username or password not valid"));
		}
	}

	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}

}
