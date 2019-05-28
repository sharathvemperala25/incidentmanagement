package com.hcl.incidentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.incidentmanagement.entity.Incident;
import com.hcl.incidentmanagement.entity.IncidentType;
import com.hcl.incidentmanagement.entity.User;
import com.hcl.incidentmanagement.repository.IncidentRepository;
import com.hcl.incidentmanagement.repository.IncidentTypeRepository;

@Service
public class IncidentServiceImpl implements IncidentService {
	@Autowired
	IncidentService incidentService;
	
	@Autowired
	IncidentTypeRepository incidentTypeRepository;

	@Autowired
	IncidentRepository incidentRepository;

	@Override
	public Incident createIncident(Incident incident) {
		return incidentRepository.save(incident);
	}

	

	@Override
	public List<Incident> getIncidentsByinccidentTypeId(String incidentType) {
		// TODO Auto-generated method stub
		
		
		return incidentRepository.findByIncidentType(incidentType);
	}

@Override
	public Incident search(Long id) {
	
		return incidentRepository.findById(id).get();
	}

	@Override
	public String status(Long id, String status) {
		
	Incident incident= incidentRepository.findById(id).get();
	 incident.setStatus(status);
	 incidentRepository.save(incident);
	 
		return "Status "+incident.getStatus();
	}
}
