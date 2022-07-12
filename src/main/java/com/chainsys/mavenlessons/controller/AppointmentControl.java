package com.chainsys.mavenlessons.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.mavenlessons.entity.Appointment;
import com.chainsys.mavenlessons.repository.AppointmentRepository;

@RestController
public class AppointmentControl {
	@Autowired
	private AppointmentRepository repo;
	@GetMapping(value = "/getappointmentbyid")
	public Appointment findAppointmentById(int id) {
		return repo.findById(id);
		
	}
	@PostMapping("/newappointment")
	public String  addAppointment(@RequestBody Appointment app) {
		 repo.save(app);
		return "Redirect:/getallappointments";
	}
	@DeleteMapping("/deleteappointment")
	public String deleteAppointmentById(int app_id) {
		repo.deleteById(app_id);
		return "Redirect:/getallappointments";
		
	}
	@GetMapping("/getallappointments")
	public List<Appointment>  getAllAppointments(){
		return repo.findAll();
	}
	@PostMapping("/modifyappointment")
	public String  updateAppointment(@RequestBody Appointment app) {
		 repo.save(app);
		return "Redirect:/getallappointments";
	}
	
	@GetMapping(value =  "/getallbydoctorid" )
	public Appointment findAllDoctorById(int doctor_id) {
		return repo.findById( doctor_id);
		
	}	

}
