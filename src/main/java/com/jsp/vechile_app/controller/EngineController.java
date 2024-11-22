package com.jsp.vechile_app.controller;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.vechile_app.entity.Engine;
import com.jsp.vechile_app.service.EngineService;
import com.jsp.vechile_app.util.ResponseStructure;

@RestController
public class EngineController {
	   @Autowired
		private EngineService engineService;
	    
	    @PostMapping("/saveengine")
		public ResponseEntity<ResponseStructure<Engine>> saveEngine(@PathVariable int id,@RequestBody Engine engine){
			
			return engineService.saveEngine(id,engine);
		}
	    
	    @GetMapping("/getengine/{id}")
	    public ResponseEntity<ResponseStructure<Engine>> getEngineById(@PathVariable int id){
	    	return engineService.getEngineById(id);
	    }
	    
	    @GetMapping("/getallengine")
	    public ResponseEntity<ResponseStructure<Engine>> getAllEngine(){
	    	return engineService.getAllEngine();
	    }
}
