package com.hcl.incidentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.incidentmanagement.entity.IncidentType;

@Repository
public interface IncidentTypeRepository  extends JpaRepository<IncidentType,Long> {

}
