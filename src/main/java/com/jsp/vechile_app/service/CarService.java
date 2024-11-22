package com.jsp.vechile_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.vechile_app.dao.CarDao;
import com.jsp.vechile_app.entity.Car;
import com.jsp.vechile_app.entity.Car;
import com.jsp.vechile_app.util.ResponseStructure;

@Service
public class CarService {

	@Autowired
	private CarDao carDao;
	
	public ResponseEntity<ResponseStructure<Car>> saveCar(Car c){
		Car car = carDao.saveCar(c);
		ResponseStructure res=new ResponseStructure<Car>();
		res.setData(car);
		res.setMessage("Sucess");
		res.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Car>>(res,HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseStructure<Car>> getCarById(int id){
    	Car car = carDao.getCarId(id);
    	ResponseStructure res=new ResponseStructure<Car>();
    	if(car!=null) {
    		res.setData(car);
    		res.setMessage("Sucess");
    		res.setStatusCode(HttpStatus.OK.value());
    		return new ResponseEntity<ResponseStructure<Car>>(res,HttpStatus.OK);
    	}else {
    		res.setData(car);
    		res.setMessage("Car Data Not Present");
    		res.setStatusCode(HttpStatus.BAD_REQUEST.value());
    		return new ResponseEntity<ResponseStructure<Car>>(res,HttpStatus.BAD_REQUEST);
    	}
    }
	
	public ResponseEntity<ResponseStructure<Car>> getAllCar(){
		List<Car> car=carDao.getAllCar();
		ResponseStructure res=new ResponseStructure<Car>();
    	if(car!=null) {
    		res.setData(car);
    		res.setMessage("Sucess");
    		res.setStatusCode(HttpStatus.OK.value());
    		return new ResponseEntity<ResponseStructure<Car>>(res,HttpStatus.OK);
    	}else {
    		res.setData(car);
    		res.setMessage("Car Data Not Present");
    		res.setStatusCode(HttpStatus.BAD_REQUEST.value());
    		return new ResponseEntity<ResponseStructure<Car>>(res,HttpStatus.BAD_REQUEST);
    	}
		
	}
}
