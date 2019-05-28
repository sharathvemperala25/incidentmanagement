package com.hcl.incidentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.incidentmanagement.entity.Incident;
import com.hcl.incidentmanagement.repository.IncidentRepository;

@Service
public class IncidentServiceImpl implements IncidentService {
	@Autowired
	IncidentService incidentService;

	@Autowired
	IncidentRepository incidentRepository;

	@Override
	public Incident createIncident(Incident incident) {
		return incidentRepository.save(incident);
	}

}
