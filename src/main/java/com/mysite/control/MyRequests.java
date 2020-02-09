package com.mysite.control;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mysite.service.MyService;
import com.site.model.StudentModel;

@Path("/mysource")
public class MyRequests {
	
	MyService s=new MyService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentModel> demo() {
		
		System.out.println("allprofile");
		return s.getAllProfiles();
	}
	
	@GET
	@Path("/{proId}")
	@Produces(MediaType.APPLICATION_JSON)
	public StudentModel demo1(@PathParam("proId") int proId) {
	System.out.println("single profile"+proId);
	return s.getProfile(proId);
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentModel demo2(StudentModel proId) {
	System.out.println("add profile"+proId);
	return s.addProfile(proId);
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentModel demo3(StudentModel proId) {
	System.out.println("add profile"+proId);
	return s.profileUpDate(proId);
	}
	
	@DELETE
	@Path("/delete/{proId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentModel demo4(@PathParam("proId") int proId) {
	System.out.println("add profile"+proId);
	return s.profileRemove(proId);
	}
	
}
