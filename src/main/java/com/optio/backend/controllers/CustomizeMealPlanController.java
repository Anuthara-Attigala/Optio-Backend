/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;


import com.optio.backend.models.CustomizeMealPlan;
import com.optio.backend.repositories.CustomizeMealPlanRepository;
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
public class CustomizeMealPlanController {
       @Autowired
       CustomizeMealPlanRepository customizeMealPlanRepository;
       //Post raw food data to database
        @RequestMapping(method=RequestMethod.POST,value="/customize")
            public CustomizeMealPlan save(@RequestBody CustomizeMealPlan mealPlan){ 
                 customizeMealPlanRepository.save(mealPlan);
                 return mealPlan;
         }
        //Retrieve Raw food data
}
