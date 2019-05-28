package com.hcl.incidentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.incidentmanagement.entity.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {
	
	List<Incident> findByIncidentType(String incidentType);

}
