package etech.custom;

import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebFilter;

import org.springframework.web.filter.DelegatingFilterProxy;

@WebFilter(filterName="springSecurityFilterChain", urlPatterns= "/*", dispatcherTypes= {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class CustomDelegatingFilterProxy extends DelegatingFilterProxy {

}
