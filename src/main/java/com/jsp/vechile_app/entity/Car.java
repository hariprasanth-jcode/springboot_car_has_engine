package com.jsp.vechile_app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Car {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_id;
	private String model;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="my_engine_id")
	@JsonIgnore
	private Engine engine;
}
