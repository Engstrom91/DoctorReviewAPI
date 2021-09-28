package com.larsengstrom.doctorreviewapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.larsengstrom.doctorreviewapi.model.Doctor;
import com.larsengstrom.doctorreviewapi.repository.DoctorRepository;

@Configuration //This class is responsible for preloading our database. 
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean //All CommandLineRunner beans are run as soon as the application context is loaded.
	  CommandLineRunner initDatabase(DoctorRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Doctor("Dr. Jeffrey Cole", "Surgery", 3, 5)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Amber Volakis", "Radiology", 5, 2)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Travis Brennan", "Epidemiology", 4, 3)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Lisa Cuddy", "Endocrinology", 5, 1)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Christopher Turk", "Surgery", 3, 4)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Erica Hahn", "Immunology", 5, 5)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. James Wilson", "Oncology", 4, 2)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Stephanie Edwards", "Surgery", 2, 5)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Eric Foreman", "Neurology", 5, 4)));
	      log.info("Preloading " + repository.save(new Doctor("Dr. Allison Cameron", "Immunology", 5, 5)));
	    };
}
}
