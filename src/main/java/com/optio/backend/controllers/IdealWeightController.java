package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.IdealWeight;
import com.optio.backend.repositories.IdealWeightRepository;

@RestController
public class IdealWeightController {
	@Autowired
	IdealWeightRepository idealWeightRepository;

	@RequestMapping(method=RequestMethod.POST,value="/idealweight")
	public String save(@RequestBody IdealWeight idealweight){
		idealWeightRepository.save(idealweight);
		return idealweight.getId();
	}
	@RequestMapping(method=RequestMethod.PUT,value="/idealweight")
	public String update(@RequestBody IdealWeight idealweight){
		idealWeightRepository.save(idealweight);
		return idealweight.getId();
	}
	@RequestMapping(method=RequestMethod.GET,value="/idealweight/{nic}")
	public IdealWeight getWeight(@PathVariable String nic){
		return idealWeightRepository.findByNic(nic);
	}
}
