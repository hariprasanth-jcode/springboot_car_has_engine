package com.jsp.vechile_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.vechile_app.entity.Car;

public interface CarJpaRepository extends JpaRepository<Car,Integer> {

}
