/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.BodyComposition;
import com.optio.backend.repositories.BodyCompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
