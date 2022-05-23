package com.appointment.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.springboot.exception.ResourceNotFoundException;
import com.appointment.springboot.model.Doctor;
import com.appointment.springboot.repository.DoctorRepository;

@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/api/v1/")
public class DoctorController {

	@Autowired
	private DoctorRepository doctorRepository;
	
	//get all doctor
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors() {
		
		return doctorRepository.findAll();
	}
	
	// create Doctor 
	@PostMapping("/doctors")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}
	
	//get Doctor by id
	@GetMapping("/doctors/{id}")	
	public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
		
		Doctor doctor = doctorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor with this ID do not exixts!"));
		
		return ResponseEntity.ok(doctor);
	}
	
	
	
	//delete Doctor by ID
	@DeleteMapping("/doctors/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDoctor(@PathVariable Long id) {
		
		Doctor doctor = doctorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor with this ID do not exixts!"));
		
		doctorRepository.delete(doctor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return ResponseEntity.ok(response);
	}
	
	
	//update patient count by id when a new patient is created
	@PutMapping("/doctors/pcount/{id}")
	public ResponseEntity<Doctor> updatePatientCountByDoctorId(@PathVariable Long id) {
		Doctor doctor = doctorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor with this ID do not exixts!"));
		
		int pCount = doctor.getpatientCount() + 1;
		doctor.setpatientCount(pCount);
		
		Doctor updatedDoctor = doctorRepository.save(doctor);
		
		return ResponseEntity.ok(updatedDoctor);
	}
	
	
}
