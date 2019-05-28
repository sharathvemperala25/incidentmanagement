package com.hcl.incidentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.incidentmanagement.entity.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {

}
