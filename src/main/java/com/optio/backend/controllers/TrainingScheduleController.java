package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.TrainingSchedule;
import com.optio.backend.repositories.TrainingScheduleRepository;

@RestController
public class TrainingScheduleController {

	@Autowired
	TrainingScheduleRepository repository;
	
	@RequestMapping(method=RequestMethod.GET,value="/trainingSchedule")
	public Iterable<TrainingSchedule> getTrainingSchedules(){
		//System.out.print(something);
		return repository.findAll();
	}
	@RequestMapping(method=RequestMethod.POST,value="/trainingSchedule")
	public String save(@RequestBody TrainingSchedule trainingSchedule){
		repository.save(trainingSchedule);
		return trainingSchedule.getId();
	}
	@RequestMapping(method=RequestMethod.GET,value="/trainingSchedule/{nic}")
	public TrainingSchedule show(@PathVariable String nic){
		return repository.findByNic(nic);
	}
}
