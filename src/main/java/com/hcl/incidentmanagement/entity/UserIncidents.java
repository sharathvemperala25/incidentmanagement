package com.hcl.incidentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incidents")
public class UserIncidents {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long user_id;
	private Long incident_id;
	private String description;
	private String status;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getIncident_id() {
		return incident_id;
	}
	public void setIncident_id(Long incident_id) {
		this.incident_id = incident_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserIncidents() {
	}
	

}
