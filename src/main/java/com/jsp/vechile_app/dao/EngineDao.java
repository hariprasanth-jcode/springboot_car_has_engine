package com.jsp.vechile_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.vechile_app.entity.Engine;
import com.jsp.vechile_app.repository.EngineJpaRepository;

@Repository
public class EngineDao {
	@Autowired
    private EngineJpaRepository engineJpaRepository;
    
    
    public Engine saveEngine( Engine e) {
    	return engineJpaRepository.save(e);
    }
    
    public Engine getEngineId(int id) {
    	Optional<Engine> option = engineJpaRepository.findById(id);
    	return option.isPresent()?option.get():null;
    }
    public List<Engine> getAllEngine(){
    	  List<Engine> engine = engineJpaRepository.findAll();
    	  return engine;
    }
}
