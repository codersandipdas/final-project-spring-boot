package com.appointment.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "specialist")
	private String specialist;
	
	@Column(name = "patientCount")
	private int patientCount;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, int age, String gender, String specialist, int patientCount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
		this.patientCount = patientCount;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	public int getpatientCount() {
		return patientCount;
	}
	public void setpatientCount(int patientCount) {
		this.patientCount = patientCount;
	}
	
	
	
}
