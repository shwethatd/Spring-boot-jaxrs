package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/api")
public class EasyController {
	
	@Context
	HttpServletRequest request;
	
	@Path("/hello")
	@GET
	@Produces("application/json")
	public Response getHello() {
		System.out.println("hi.....");
		User user = new User("XYZ",10);
		System.out.println(user.toString());
		//return Response.ok(user).build();
		return Response.status(201).entity(user).build();
	}
	
	

}
