package com.kelvin.oocl.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
	
	@GET 
    @Path("/{param}")  
    public Response getMsg(@PathParam("param") String msg) {  
        String output = "Jersey say : " + msg;  
        return Response.status(200).entity(output).build();  
    }  
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello Jersey";
	}
	
	@GET
	@Path("/AAA")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloXml() {
		return "Hello JerseyEEE";
	}
}
