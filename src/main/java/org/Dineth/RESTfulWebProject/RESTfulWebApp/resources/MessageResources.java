package org.Dineth.RESTfulWebProject.RESTfulWebApp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Dineth.RESTfulWebProject.RESTfulWebApp.model.message;
import org.Dineth.RESTfulWebProject.RESTfulWebApp.service.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService messageservice = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<message> getMessage(){
		
		return messageservice.getAllMessages();
	}

}
