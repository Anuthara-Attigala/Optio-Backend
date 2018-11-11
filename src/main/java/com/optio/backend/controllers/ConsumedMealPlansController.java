/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;



import com.optio.backend.models.Athlete;
import com.optio.backend.models.ConsumedMealPlans;
import com.optio.backend.models.ConsumedTotalCalorie;
import com.optio.backend.models.DailyCalorieIntake;
import com.optio.backend.repositories.AthleteRepository;
import com.optio.backend.repositories.ConsumedMealPlansRepository;
import com.optio.backend.repositories.ConsumedTotalCalorieRepository;
import com.optio.backend.repositories.DailyCalorieIntakeRepository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sewmi
 */
@RestController
public class ConsumedMealPlansController {
    @Autowired
    ConsumedMealPlansRepository consumedMealPlansRepository;
    @Autowired
    AthleteRepository athleteRepository;
    @Autowired
    DailyCalorieIntakeRepository  dailyCalorieIntakeRepository;
    @Autowired
    ConsumedTotalCalorieRepository  consumedTotalCalorieRepository;
    
    @RequestMapping(method=RequestMethod.POST,value="/ConsumedMeals/{nic}")
	public String save(@RequestBody ConsumedMealPlans consumed,@PathVariable String nic){
            consumed.setNic(nic);
            //Set current Date
               DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       Date date = new Date();
               String today = dateFormat.format(date);
            consumed.setDate(today);
	consumedMealPlansRepository.save(consumed);
        DailyCalorieIntake dci=dailyCalorieIntakeRepository.findFirst1ByNicOrderByDateDesc(nic);
        float newCalories=Float.valueOf(dci.getTotalCalorie())-Float.valueOf(consumed.getCalorie());
        dci.setTotalCalorie(String.valueOf(newCalories));
        dailyCalorieIntakeRepository.save(dci);
	return consumed.getId();
	}
        
        
        //Get daily Total consumed data order by date and nic
        @RequestMapping(method=RequestMethod.POST,value="/TotalCalorieConsumption/{nic}")
      public ConsumedTotalCalorie GetCalorie(@PathVariable String nic,@RequestBody ConsumedTotalCalorie consumedtc){
          //Set current Date
               DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	       Date date = new Date();
               String today = dateFormat.format(date);
               List<ConsumedMealPlans> cal= consumedMealPlansRepository.findByNicAndDateContaining(nic,today);
               float totalCalories=0;
               for (ConsumedMealPlans element : cal) {
                   totalCalories=totalCalories+Float.valueOf(element.getCalorie());
               }
               consumedtc.setDate(today);
               consumedtc.setNic(nic);
               consumedtc.setTotalcalorie(String.valueOf(totalCalories));
               consumedTotalCalorieRepository.save(consumedtc);
    

        
           return consumedtc;           
          }
}
