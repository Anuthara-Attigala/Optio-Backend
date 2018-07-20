package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.AthleteInitial;
import com.optio.backend.models.StepCount;
import com.optio.backend.repositories.StepCountRepository;

@RestController
public class StepCountController {
	@Autowired
	StepCountRepository stepCountRepository;
	
	@RequestMapping(method=RequestMethod.GET,value="/steps")
	public Iterable<StepCount> stepCount(){
		//System.out.print(something);
		return stepCountRepository.findAll();
	}

	@RequestMapping(method=RequestMethod.POST,value="/steps")
	public String save(@RequestBody StepCount stepCount){
		stepCountRepository.save(stepCount);
		return stepCount.getId();
	}
	@RequestMapping(method=RequestMethod.GET,value="/steps/{nic}/{date}")
	public Iterable<StepCount> show(@PathVariable String nic,@PathVariable String date){
		return stepCountRepository.findByNicAndDateGreaterThan(nic, date);
	}
}
