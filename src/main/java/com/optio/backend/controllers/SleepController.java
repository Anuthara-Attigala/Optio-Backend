/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.BodyComposition;
import com.optio.backend.models.Sleep;
import com.optio.backend.repositories.BodyCompositionRepository;
import com.optio.backend.repositories.SleepRepository;
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
public class SleepController {
    @Autowired
	SleepRepository sleepRepository;
    
        @RequestMapping(method=RequestMethod.POST,value="/sleep")
	public String save(@RequestBody Sleep sleep){
		sleepRepository.save(sleep);
		return sleep.getId();
	}
}
