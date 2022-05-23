package com.appointment.springboot.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatientTest {

	@Test
	void testPatient() {
		
		Patient patient = new Patient("Sandip Das", 22, "Barsha DebNath", "2022-05-22", "Uploaded");
		
		assertEquals("Sandip Das", patient.getName());
		
		assertEquals(22, patient.getAge());
		
		assertEquals("Barsha DebNath", patient.getVisitedDr());
		
		assertEquals("2022-05-22", patient.getDateOfVisit());
		
		assertEquals("Uploaded", patient.getPescription());
		
	}

}
