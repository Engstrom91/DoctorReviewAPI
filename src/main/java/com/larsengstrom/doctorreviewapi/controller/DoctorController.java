package com.larsengstrom.doctorreviewapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.larsengstrom.doctorreviewapi.model.Doctor;
import com.larsengstrom.doctorreviewapi.repository.DoctorRepository;

import exceptions.DoctorNotFoundException;

@RestController
public class DoctorController {
	private final DoctorRepository repository;
	
	DoctorController(DoctorRepository repository){
		this.repository = repository;
	}
	
	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/doctors")
	  List<Doctor> all() {
	    return repository.findAll();
	  }
	  // end::get-aggregate-root[]
	  
	  @PostMapping("/doctors")
	  Doctor newDoctor(@RequestBody Doctor newDoctor) {
	    return repository.save(newDoctor);
	  }
	  
	  // Single item
	  
	  @GetMapping("/doctors/{id}")
	  Doctor one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new DoctorNotFoundException(id));
	  }
	  
	  @PutMapping("/doctors/{id}")
	  Doctor replaceDoctor(@RequestBody Doctor newDoctor, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(doctor -> {
	        doctor.setName(newDoctor.getName());
	        doctor.setSpeciality(newDoctor.getSpeciality());
	        return repository.save(doctor);
	      })
	      .orElseGet(() -> {
	        newDoctor.setId(id);
	        return repository.save(newDoctor);
	      });
	  }
	  
	  @DeleteMapping("/doctors/{id}")
	  void deleteDoctor(@PathVariable Long id) {
	    repository.deleteById(id);
	  }
}
