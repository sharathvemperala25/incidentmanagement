package com.hcl.incidentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.incidentmanagement.entity.UserIncidents;

@Repository
public interface UserIncidentsRepository extends JpaRepository<UserIncidents,Long>{

	List<UserIncidents> findAllById(Long id);
	
	@Query(value = "SELECT * FROM incidents u WHERE u.user_id = ?1", nativeQuery = true)  
	List<UserIncidents> findAllByUser_id(Long user_id);
	 

}
