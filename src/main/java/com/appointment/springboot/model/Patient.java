package com.appointment.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "visitedDr")
	private String visitedDr;
	
	@Column(name = "dateOfVisit")
	private String dateOfVisit;
	
	@Column(name = "pescription")
	private String pescription;
	
	public Patient() {
		
	}

	public Patient(String name, int age, String visitedDr, String dateOfVisit, String pescription) {
		super();
		this.name = name;
		this.age = age;
		this.visitedDr = visitedDr;
		this.dateOfVisit = dateOfVisit;
		this.pescription = pescription;
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

	public String getVisitedDr() {
		return visitedDr;
	}

	public void setVisitedDr(String visitedDr) {
		this.visitedDr = visitedDr;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getPescription() {
		return pescription;
	}

	public void setPescription(String pescription) {
		this.pescription = pescription;
	}
	
	

}
