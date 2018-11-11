/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Fitness;
import com.optio.backend.models.Injury;
import com.optio.backend.repositories.FitnessRepository;
import java.util.List;
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
public class FitnessController {
    @Autowired
	FitnessRepository fitnessRepository;
	
	@RequestMapping(method=RequestMethod.POST,value="/fitness")
	public String save(@RequestBody Fitness fitness){
		fitnessRepository.save(fitness);
		return fitness.getId();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/fitness/{athleteNIC}")
	public List<Fitness> show(@PathVariable String athleteNIC){
                List<Fitness> fitness=(List<Fitness>) fitnessRepository.findByAthleteNIC(athleteNIC);
		return fitness;
	}
}
