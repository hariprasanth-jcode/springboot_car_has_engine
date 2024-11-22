package com.jsp.vechile_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.vechile_app.entity.Car;
import com.jsp.vechile_app.repository.CarJpaRepository;

@Repository
public class CarDao {

	@Autowired
	private CarJpaRepository carJpaRepository;
	
	
	public Car saveCar(Car c) {
		return carJpaRepository.save(c);
	}
	
	  public Car getCarId(int id) {
	    	Optional<Car> option = carJpaRepository.findById(id);
	    	return option.isPresent()?option.get():null;
	    }
	  
	  public List<Car> getAllCar(){
		  return carJpaRepository.findAll();
	  }
	
}
