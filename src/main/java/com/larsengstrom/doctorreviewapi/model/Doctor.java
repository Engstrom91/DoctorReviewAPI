package com.larsengstrom.doctorreviewapi.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	  private @Id @GeneratedValue Long id;
	  private String name;
	  private String speciality;
	
	public Doctor(){}
	public Doctor(String name, String speciality){
		this.name = name;
		this.speciality = speciality;
		
	
	}
	
	  	  public Long getId() {
		    return this.id;
		  }

		  public String getName() {
		    return this.name;
		  }

		  public String getSpeciality() {
		    return this.speciality;
		  }
		  
		  public void setId(Long id) {
			    this.id = id;
			  }

			  public void setName(String name) {
			    this.name = name;
			  }

			  public void setSpeciality(String speciality) {
			    this.speciality = speciality;
			  }
			  
			  @Override
			  public boolean equals(Object o) {

			    if (this == o)
			      return true;
			    if (!(o instanceof Doctor))
			      return false;
			    Doctor doctor = (Doctor) o;
			    return Objects.equals(this.id, doctor.id) && Objects.equals(this.name, doctor.name)
			        && Objects.equals(this.speciality, doctor.speciality);
			  }
			  @Override
			  public int hashCode() {
			    return Objects.hash(this.id, this.name, this.speciality);
			  }
			  @Override
			  public String toString() {
			    return "Doctor{" + "id=" + this.id + ", name='" + this.name + '\'' + ", speciality='" + this.speciality + '\'' + '}';
			  }
}
