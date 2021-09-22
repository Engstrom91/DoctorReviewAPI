package com.larsengstrom.doctorreviewapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.larsengstrom.doctorreviewapi.model.Doctor;
import com.larsengstrom.doctorreviewapi.repository.DoctorRepository;

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	  CommandLineRunner initDatabase(DoctorRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Doctor("Doctor House", "neurology")));
	      log.info("Preloading " + repository.save(new Doctor("Doctor Dre", "neurology")));
	    };
}
}
