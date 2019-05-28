package com.hcl.incidentmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.incidentmanagement.entity.UserIncidents;
import com.hcl.incidentmanagement.repository.UserIncidentsRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ims")
@Api(value="Incident Management System", description="Incident Management System")
public class UserIncidentsController {
	@Autowired
	UserIncidentsRepository userIncidentsRepository;
	
	@ApiOperation(value = "View the details of Incident by passing Incident Id", response = List.class)
	@GetMapping("/getuserincident/{id}")
	public List<UserIncidents>getUserIncidents(@PathVariable(value="id")Long id ){
		List<UserIncidents> ui=userIncidentsRepository.findAllById(id);
		return ui;
	}
	
	
	@ApiOperation(value = "View a list of Incidents raised by a User", response = List.class)
	@GetMapping("/getbyuser/{id}") 
	public List<UserIncidents>getUserIncidentsByUser(@PathVariable(value="id")Long user_id ){ 
		 List<UserIncidents> ui2=userIncidentsRepository.findAllByUser_id(user_id); 
		 return ui2; 
	}
	 
	 
	 
	@ApiOperation(value = "Raise an incident", response = UserIncidents.class)
	@PostMapping("/addincident")
	public UserIncidents addIncident(@Valid @RequestBody UserIncidents userIncidents) {
		return userIncidentsRepository.save(userIncidents);
	}

}
