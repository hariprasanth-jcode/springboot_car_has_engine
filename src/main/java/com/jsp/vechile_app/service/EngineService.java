package com.jsp.vechile_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.vechile_app.dao.CarDao;
import com.jsp.vechile_app.dao.EngineDao;
import com.jsp.vechile_app.entity.Car;
import com.jsp.vechile_app.entity.Engine;
import com.jsp.vechile_app.util.ResponseStructure;

@Service
public class EngineService {
        @Autowired
		private EngineDao engineDao;
		
        @Autowired
        private CarDao carDao;
        public ResponseEntity<ResponseStructure<Engine>> saveEngine(int id,Engine e){
        	Engine engine = engineDao.saveEngine(e);
        	ResponseStructure res=new ResponseStructure<Engine>();
    		res.setData(engine);
    		res.setMessage("Sucess");
    		res.setStatusCode(HttpStatus.OK.value());
    		return new ResponseEntity<ResponseStructure<Engine>>(res,HttpStatus.OK);
        	
        }
        
        public ResponseEntity<ResponseStructure<Engine>> getEngineById(int id){
        	Engine engine = engineDao.getEngineId(id);
        	ResponseStructure res=new ResponseStructure<Engine>();
        	if(engine!=null) {
        		res.setData(engine);
        		res.setMessage("Sucess");
        		res.setStatusCode(HttpStatus.OK.value());
        		return new ResponseEntity<ResponseStructure<Engine>>(res,HttpStatus.OK);
        	}else {
        		res.setData(engine);
        		res.setMessage("Engine Data Not Present");
        		res.setStatusCode(HttpStatus.BAD_REQUEST.value());
        		return new ResponseEntity<ResponseStructure<Engine>>(res,HttpStatus.BAD_REQUEST);
        	}
        }
        
        public ResponseEntity<ResponseStructure<Engine>> getAllEngine(){
        	List<Engine> engine = engineDao.getAllEngine();
         	ResponseStructure res=new ResponseStructure<Engine>();
        	if(engine!=null) {
        		res.setData(engine);
        		res.setMessage("Sucess");
        		res.setStatusCode(HttpStatus.OK.value());
        		return new ResponseEntity<ResponseStructure<Engine>>(res,HttpStatus.OK);
        	}else {
        		res.setData(engine);
        		res.setMessage("Engine Data Not Present");
        		res.setStatusCode(HttpStatus.BAD_REQUEST.value());
        		return new ResponseEntity<ResponseStructure<Engine>>(res,HttpStatus.BAD_REQUEST);
        	}
        	
        }
		
}
