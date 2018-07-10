package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.AthleteInitial;
import com.optio.backend.repositories.AthleteInitialRepository;

@RestController
public class AthleteInitialController {
	@Autowired
	AthleteInitialRepository athleteInitalRepository;
	
	@RequestMapping(method=RequestMethod.GET,value="/athleteInit")
	public Iterable<AthleteInitial> injury(){
		//System.out.print(something);
		return athleteInitalRepository.findAll();
	}
	@RequestMapping(method=RequestMethod.POST,value="/athleteInit")
	public String save(@RequestBody AthleteInitial athleteInitial){
		athleteInitalRepository.save(athleteInitial);
		return athleteInitial.getId();
	}
	@RequestMapping(method=RequestMethod.GET,value="/athleteInit/{nic}")
	public AthleteInitial show(@PathVariable String nic){
		return athleteInitalRepository.findByNic(nic);
	}

}
