package com.axelor.resteasy.hello;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.jboss.resteasy.plugins.guice.RequestScoped;
import org.jboss.resteasy.spi.HttpRequest;


public class MyClass {
	 @Inject 
	 @RequestScoped
     @Context
	    private HttpRequest request;
}
