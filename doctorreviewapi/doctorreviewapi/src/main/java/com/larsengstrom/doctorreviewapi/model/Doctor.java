package com.larsengstrom.doctorreviewapi.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//This class defines what constitutes a doctor in our system. 
@Entity //The Entity annotation prepares this object to be stored in the JPA.
public class Doctor {
	  private @Id @GeneratedValue Long id; //This is our primary key.
	  private String name;
	  private String speciality;
	  private int treatmentScore;
	  private int personalityScore;
	
	public Doctor(){}
	public Doctor(String name, String speciality){
		this.name = name;
		this.speciality = speciality;		
	}
	public Doctor(String name, String speciality, int treatmentScore, int personalityScore){
		this.name = name;
		this.speciality = speciality;
		this.treatmentScore = treatmentScore;
		this.personalityScore = personalityScore;
		
	
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
		  
		  public Integer getTreatmentScore() {
			    return this.treatmentScore;
			  }
		  
		  public Integer getPersonalityScore() {
			    return this.personalityScore;
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
			  public int hashCode() {
			    return Objects.hash(this.id, this.name, this.speciality, this.treatmentScore, this.personalityScore);
			  }
			  @Override
			  public String toString() {
			    return "Doctor{" + "id=" + this.id + ", name='" + this.name + '\'' + ", speciality='" + this.speciality + '\'' + ", treatmentScore='" + this.treatmentScore + '\'' + ", personalityScore='" + this.personalityScore + '\'' + '}';
			  }
}
