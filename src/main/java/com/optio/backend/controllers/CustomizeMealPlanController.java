/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;


import com.optio.backend.models.CustomizeMealPlan;
import com.optio.backend.models.CustomizedPlans;
import com.optio.backend.models.DailyCalorieIntake;
import com.optio.backend.repositories.CustomizeMealPlanRepository;
import com.optio.backend.repositories.CustomizedPlansRepository;
import com.optio.backend.repositories.DailyCalorieIntakeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
       @Autowired
       CustomizedPlansRepository customizedPlansRepository;
       @Autowired
       DailyCalorieIntakeRepository dailyCalorieIntakeRepository;
       //Post raw food data to database
        @RequestMapping(method=RequestMethod.POST,value="/customize/{nic}")
            public CustomizedPlans save(@RequestBody List<CustomizeMealPlan> rawFoods,@PathVariable String nic){ 
                 CustomizedPlans cmp =new CustomizedPlans();
                 cmp.setNic(nic);
                 cmp.setRawFoods(rawFoods);
                 float totalCalories=0;
               for (CustomizeMealPlan element : rawFoods) {
                   totalCalories=totalCalories+Float.valueOf(element.getCalorie());
               }
                             
               cmp.setCalorie(Float.toString(totalCalories));
               customizedPlansRepository.save(cmp);
               
                DailyCalorieIntake dci=dailyCalorieIntakeRepository.findFirst1ByNicOrderByDateDesc(nic);
                float newCalories=Float.valueOf(dci.getTotalCalorie())-Float.valueOf(cmp.getCalorie());
                dci.setTotalCalorie(String.valueOf(newCalories));
                dailyCalorieIntakeRepository.save(dci);
                 
                 return cmp;
         }
        //Retrieve Raw food data
            @RequestMapping(method=RequestMethod.GET,value="/rawfoods")
	public List<CustomizeMealPlan> lastFeedback(){
		return customizeMealPlanRepository.findAll();
	}
}
