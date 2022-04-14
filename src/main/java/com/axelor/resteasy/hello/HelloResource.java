package com.axelor.resteasy.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class HelloResource
{
//   @GET
//   @Path("{name}")
//   public String hello(@PathParam("name") final String name) {
//      return "Hello " + name;
//   }
	
	@GET
	@Path("/")
	public String name() {
		return "Hello";
		
	}
}