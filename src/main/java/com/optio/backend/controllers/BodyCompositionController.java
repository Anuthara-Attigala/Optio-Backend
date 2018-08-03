/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.BodyComposition;
import com.optio.backend.repositories.BodyCompositionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class BodyCompositionController {
    @Autowired
	BodyCompositionRepository bodyCompositionRepository;
    
        @RequestMapping(method=RequestMethod.POST,value="/bodycomposition")
	public String save(@RequestBody BodyComposition bodyComposition){
		bodyCompositionRepository.save(bodyComposition);
		return bodyComposition.getId();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/bodycomposition")
	public Iterable<BodyComposition> bodycomp(){
		//System.out.print(something);
		return bodyCompositionRepository.findAll();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/bodycomposition/{nic}")
	public BodyComposition show(@PathVariable String nic){
		return bodyCompositionRepository.findByNic(nic);
	}
        
        /**@RequestMapping(method=RequestMethod.PUT,value="/bodycomposition/{nic}")
	public @ResponseBody String update(@PathVariable String nic ,@RequestBody BodyComposition bodyComposition){
		bodyCompositionRepository.save(bodyComposition);
		return bodyComposition.getId();
	}**/
        
        @PutMapping("/bodycomposition/{id}")
        public ResponseEntity<Object> update(@RequestBody BodyComposition bodyComposition,@PathVariable String id)
        {
            Optional<BodyComposition> bodyCompOpttional=bodyCompositionRepository.findById(id);
            if(!bodyCompOpttional.isPresent())
            {
                return ResponseEntity.notFound().build();
            }
            bodyComposition.setId(id);
            bodyCompositionRepository.save(bodyComposition);
            return ResponseEntity.noContent().build();
        }
    
}
