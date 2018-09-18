/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.BodyComposition;
import com.optio.backend.models.Vaccination;
import com.optio.backend.repositories.VaccinationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class VaccinationController {
    @Autowired
	VaccinationRepository vaccinationRepository;
    
        @RequestMapping(method=RequestMethod.POST,value="/vaccination")
	public String save(@RequestBody Vaccination vaccination){
		vaccinationRepository.save(vaccination);
		return vaccination.getId();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/vaccination/{nic}")
	public List<Vaccination> show(@PathVariable String nic){
                List<Vaccination> vaccines=(List<Vaccination>) vaccinationRepository.findByNic(nic);
		return vaccines;
	}
        
        @PutMapping("/vaccination/{id}")
        public ResponseEntity<Object> update(@RequestBody Vaccination vaccination,@PathVariable String id)
        {
            Optional<Vaccination> vaccineOpttional=vaccinationRepository.findById(id);
            if(!vaccineOpttional.isPresent())
            {
                return ResponseEntity.notFound().build();
            }
            vaccination.setId(id);
            vaccinationRepository.save(vaccination);
            return ResponseEntity.noContent().build();
        }
        
        @DeleteMapping("/vaccination/{id}")
        public String delete(@PathVariable String id)
        {
            vaccinationRepository.deleteById(id);
            return "deleted succesfully";
        }
}
