/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.DailyCalorieIntake;
import com.optio.backend.models.MealPlan;
import com.optio.backend.repositories.DailyCalorieIntakeRepository;
import com.optio.backend.repositories.MealPlansRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sewmi
 */

@RestController
public class MealPlansController {
    @Autowired
    DailyCalorieIntakeRepository dailyCalorieIntakeRepository;
    @Autowired
    MealPlansRepository mealPlanRepository;
    //Meal Plan Suggestion 
    @RequestMapping(method=RequestMethod.GET,value="/suggestMeals/{nic}")
	public MealPlan suggestMealPlans(@PathVariable String nic ){
            
       //Return Total calorie for specific user
               DailyCalorieIntake DailyCalorie = dailyCalorieIntakeRepository.findFirst1ByNicOrderByDateDesc(nic);
               float totalCal=Float.parseFloat(DailyCalorie.getTotalCalorie());        
               
       //Display meal plans List
       List<MealPlan> mealPlansList=show();
       ArrayList<MealPlan> suggestedMealList=new ArrayList<>();
       
       //Loop the MealPlans and get Mealplans less then current calories
       for (MealPlan element : mealPlansList) {
           if(Float.parseFloat(element.getCalorie())<totalCal){
               suggestedMealList.add(element);
           }
        }
       
       //get a random mealplan Suggestion
       
        Random rand = new Random();
       return suggestedMealList.get(rand.nextInt(suggestedMealList.size()));
         
   }
                
        //Get all meal Plan Data
    @RequestMapping(method=RequestMethod.GET,value="/getMealPlans")
        public List<MealPlan> show(){
            List<MealPlan> getMeals=(List<MealPlan>) mealPlanRepository.findAll();
            return getMeals;
            
        }
        
        //Post a meal plan data
//         @RequestMapping(method=RequestMethod.POST,value="/mealPlan")
//            public String save(@RequestBody MealPlan mealPlan){ 
//                 mealPlanRepository.save(mealPlan);
//                 return mealPlan.getId();
//         }
            
            
            
            
        //Get Meal Plans 
//        @RequestMapping(method=RequestMethod.GET,value="/mealPlans")
//	public List<MealPlan> getAllMealPlans(){
//		return mealPlanRepository.findAll();
//	}
}
