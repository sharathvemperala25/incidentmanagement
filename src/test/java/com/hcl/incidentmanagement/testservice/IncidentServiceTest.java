package com.hcl.incidentmanagement.testservice;




import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.incidentmanagement.entity.Incident;
import com.hcl.incidentmanagement.repository.IncidentRepository;
import com.hcl.incidentmanagement.service.IncidentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncidentServiceTest {
	@Autowired
	IncidentService incidentService;

	@MockBean
	IncidentRepository incidentRepository;

	
	
	/*
	 * @Test public void whenValid_thenincidentShouldBecreated() { Incident i1 = new
	 * Incident(1L,1L,"it","it support","submitted");
	 * Mockito.when(incidentRepository.save(any(Incident.class))).thenReturn(i1);
	 * Incident incident = incidentService.createIncident(i1);
	 * assertThat(incident.getIncidentType()).isEqualTo("i1"); }
	 */
	 @Test
		public void whenValid_thengetAllIncidents() {
			List<Incident> incidentList = new ArrayList<>();
			incidentList.add(new Incident(1L,1L,"it","it support","submitted"));
			Mockito.when(incidentRepository.findAll()).thenReturn(incidentList);
			List<Incident> incident = incidentService.getIncidentsByinccidentTypeId("it");
			assertThat(incident.size()).isEqualTo(0);
		}
	 
	

}
