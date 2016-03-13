package br.edu.ifpb.rest.services;


import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;


@Path("register")
public class RegisterService{
	
	
	@PermitAll
	@POST
	@Path("/message")
	@Consumes("application/json")
	public Response login(){
		
		ResponseBuilder builder = Response.status(Response.Status.ACCEPTED);
		return builder.build();
	}
}