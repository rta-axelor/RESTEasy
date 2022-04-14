package com.axelor.resteasy.hello;

import com.google.inject.Module;
import com.google.inject.Binder;

public class HelloModule implements Module
{
    public void configure(final Binder binder)
    {
       binder.bind(HelloResource.class);
    }
}
