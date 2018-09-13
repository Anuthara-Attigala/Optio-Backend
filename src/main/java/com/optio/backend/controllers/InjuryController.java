package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.Injury;
import com.optio.backend.repositories.InjuryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class InjuryController {
	@Autowired
	InjuryRepository injuryRepository;
	
	@RequestMapping(method=RequestMethod.POST,value="/injury")
	public String save(@RequestBody Injury injury){
		injuryRepository.save(injury);
		return injury.getId();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/injury/{nic}")
	public List<Injury> show(@PathVariable String nic){
                List<Injury> injuries=(List<Injury>) injuryRepository.findByNic(nic);
		return injuries;
	}
        
        @PutMapping("/injury/{id}")
        public ResponseEntity<Object> update(@RequestBody Injury injury,@PathVariable String id)
        {
            Optional<Injury> injuryOpttional=injuryRepository.findById(id);
            if(!injuryOpttional.isPresent())
            {
                return ResponseEntity.notFound().build();
            }
            injury.setId(id);
            injuryRepository.save(injury);
            return ResponseEntity.noContent().build();
        }
        
        @DeleteMapping("/injury/{id}")
        public String delete(@PathVariable String id)
        {
            injuryRepository.deleteById(id);
            return "deleted succesfully";
        }
	
}
