package com.jsp.vechile_app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
//@JsonIgnoreProperties({"car"}) 
public class Engine {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engine_id;
	private String type;
	
	@OneToOne(mappedBy = "engine")
	@JsonIgnore
	private Car car;
}
