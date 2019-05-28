package com.hcl.incidentmanagement.service;

import java.util.List;

import com.hcl.incidentmanagement.entity.Incident;

public interface IncidentService {
	public  Incident createIncident( Incident incident);
	
	public List<Incident> getIncidentsByinccidentTypeId(String identTypeId);

        public Incident search(Long id);
	public String status(Long id,String status);

}
