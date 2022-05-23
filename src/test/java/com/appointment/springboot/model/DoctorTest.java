package com.appointment.springboot.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void testDocotr() {
		Doctor doctor =  new Doctor("Sandip Das", 22, "Male", "MBBS", 3);
		
		String expectedName = doctor.getName();
		assertEquals("Sandip Das", expectedName);
		assertEquals(22, doctor.getAge());
		assertEquals("Male", doctor.getGender());
		assertEquals("MBBS", doctor.getSpecialist());
		assertEquals(3, doctor.getpatientCount());
		
	}

}
