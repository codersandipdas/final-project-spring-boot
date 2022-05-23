package com.appointment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.springboot.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
