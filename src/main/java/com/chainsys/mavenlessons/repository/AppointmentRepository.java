package com.chainsys.mavenlessons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.chainsys.mavenlessons.entity.Appointment;


public interface AppointmentRepository  extends CrudRepository<Appointment, Integer> {
	Appointment findById(int id) ;
	 Appointment save(Appointment app_id);       //used for adding a new doctor and modifying the doctor.
	void deleteById(int app_id);
	List<Appointment> findAll();
	
	@Query(value = "select a from Appointment a where a.doctor_id=?1")
	//JPQL -Java Persistent Query Language
	//here 'a' is an instance of appointment entity
	List<Appointment> findAllDoctorById(int  doctor_id);
	List<Appointment> fineBy	
}
