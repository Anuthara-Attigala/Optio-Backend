/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.HeartRate;
import com.optio.backend.repositories.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class HeartRateController {
    @Autowired
	HeartRateRepository heartRateRepository;
    
        @RequestMapping(method=RequestMethod.POST,value="/heartrate")
	public String save(@RequestBody HeartRate heartRate){
		heartRateRepository.save(heartRate);
		return heartRate.getId();
	}
        
}
