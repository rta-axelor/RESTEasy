package com.axelor.resteasy.hello;

import java.util.Arrays;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.Module;

public class MyServletContextListener extends GuiceResteasyBootstrapServletContextListener
{

    @Override
    protected java.util.List<? extends Module> getModules(ServletContext context)
    {
        return (java.util.List<? extends Module>) Arrays.asList(new JpaPersistModule("myJpaUnit"), new HelloModule());
    }
    
    @Override
    public void withInjector(Injector injector)
    {
        injector.getInstance(PersistService.class).start();
    }
}
