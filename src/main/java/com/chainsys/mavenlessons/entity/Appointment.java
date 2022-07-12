package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointments")
public class Appointment {
	
	@Id
	@Column(name = "app_id")
	private int app_id;
	
	@Column(name = "app_date")
	private Date app_date;
	
	@Column(name = "doctor_id")
	private int doctor_id;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doc;
	public Doctor getDoctor() {
		return this.doc;
	}
	
	@Column(name = "Patient_name")
	private String patient_name;
	
	@Column(name = "fees_collected")
	private float fees_collected;
	
	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public float getFees_collected() {
		return fees_collected;
	}

	public void setFees_collected(float fees_collected) {
		this.fees_collected = fees_collected;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, %d, %s, %s", app_id,app_date,doctor_id,patient_name,fees_collected);
	}

	


}
