package com.hcl.incidentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.incidentmanagement.entity.Incident;
import com.hcl.incidentmanagement.service.IncidentService;

@RestController
public class IncidentController {
	
	@Autowired
	IncidentService incidentService;
	@PostMapping("/createincident")
	public Incident createIncident(@RequestBody Incident incident) {

		return incidentService.createIncident(incident);
	}
	
	@GetMapping("/getincident/{}")
	public List<Incident> getIncidentBy(@RequestParam String incidentType) {

		return incidentService.getIncidentsByinccidentTypeId(incidentType);
	}


}
