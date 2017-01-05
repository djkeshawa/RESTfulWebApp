 package org.Dineth.RESTfulWebProject.RESTfulWebApp.service;

import java.util.ArrayList;
import java.util.List;

import org.Dineth.RESTfulWebProject.RESTfulWebApp.model.message;

public class MessageService {
	
	public List<message> getAllMessages(){
		message m1 = new message(1,"Hello World","dineth");
		message m2 = new message(1,"Hello World2","gishan");
		List<message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list; 
		
	} 

}
