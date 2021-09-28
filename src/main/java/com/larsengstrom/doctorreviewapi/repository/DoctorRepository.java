package com.larsengstrom.doctorreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larsengstrom.doctorreviewapi.model.Doctor;

//The repository is the interface that allows us to perform CRUD operations. 
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
