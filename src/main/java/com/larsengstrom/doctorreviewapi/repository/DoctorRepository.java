package com.larsengstrom.doctorreviewapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larsengstrom.doctorreviewapi.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
