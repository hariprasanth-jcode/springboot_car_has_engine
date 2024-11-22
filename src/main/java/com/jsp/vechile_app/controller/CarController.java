package com.jsp.vechile_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.vechile_app.entity.Car;
import com.jsp.vechile_app.service.CarService;
import com.jsp.vechile_app.util.ResponseStructure;

@RestController
public class CarController {
    @Autowired
	private CarService carService;
    
    @PostMapping("/savecar")
	public ResponseEntity<ResponseStructure<Car>> saveCar(@RequestBody Car car){
		
		return carService.saveCar(car);
	}
    
    @GetMapping("/getcar/{id}")
    public ResponseEntity<ResponseStructure<Car>> getByCarId(@PathVariable int id){
    	return carService.getCarById(id);
    }
    
    @GetMapping("/getallcars")
    public ResponseEntity<ResponseStructure<Car>> getAllCar(){
    	return carService.getAllCar();
    }
}
