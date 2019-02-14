package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class NewController {

	@Path("/getUsers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser() {
		
		User user1=new User("Aks",4);
		User user2=new User("Ayu",4);
		List<User> users=new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		return Response.ok(users).build();

	}
}
