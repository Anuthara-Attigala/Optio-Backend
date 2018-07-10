package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.Injury;
import com.optio.backend.repositories.InjuryRepository;

@RestController
public class InjuryController {
	@Autowired
	InjuryRepository injuryRepository;
	
	//@Value("${something}") 
	//String something;
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/injuries")
	public Iterable<Injury> injury(){
		//System.out.print(something);
		return injuryRepository.findAll();
	}
	
}
