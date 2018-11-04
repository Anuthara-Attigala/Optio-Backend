/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.DailyCalorieIntake;
import com.optio.backend.models.Injury;
import com.optio.backend.repositories.DailyCalorieIntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
public class DailyCalorieIntakeController {
    @Autowired
    DailyCalorieIntakeRepository dailyCalorieIntakeRepository;
    
    @RequestMapping(method=RequestMethod.POST,value="/calorie")
	public String save(@RequestBody DailyCalorieIntake calorie){
		dailyCalorieIntakeRepository.save(calorie);
		return calorie.getId();
	}
}
