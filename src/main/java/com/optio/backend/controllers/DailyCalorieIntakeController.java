/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Athlete;
import com.optio.backend.models.ConsumedMealPlans;
import com.optio.backend.models.DailyCalorieIntake;
import com.optio.backend.models.MealPlan;
import com.optio.backend.repositories.AthleteRepository;
import com.optio.backend.repositories.ConsumedMealPlansRepository;
import com.optio.backend.repositories.DailyCalorieIntakeRepository;
import com.optio.backend.repositories.MealPlansRepository;
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
 * @author Sewmi
 */
@RestController
public class DailyCalorieIntakeController {
    @Autowired
    DailyCalorieIntakeRepository dailyCalorieIntakeRepository;
    @Autowired
    AthleteRepository athleteRepository;
//   @Autowired
//    ConsumedMealPlansRepository consumedMealPlansRepository;

    
    @RequestMapping(method=RequestMethod.POST,value="/calorie")
	public String save(@RequestBody DailyCalorieIntake calorie){
               Athlete ath= athleteRepository.findByNic(calorie.getNic());
                 
               double RMR;
               String nic = ath.getNic();
               String age = ath.getAge();
               //converting string to double
               double Age=Double.parseDouble(age);
               String gender=ath.getGender();
               String activityLevel=ath.getActivityLevel();
               //converting string to double
                double ActivityLevel=Double.parseDouble(activityLevel);
               String weight=ath.getWeight();
               //converting string to double
               double Weight=new Double (weight);
               String height=ath.getHeight();
               double Height=Double.parseDouble(height);
               
               //If gender equals to Male Use this Formula to calculate RMR Value of an athlete
               //RMR= 9.9 * Weight ( Kg ) + ( 6.25 * Height ( cm ) ) - ( 4.92 * Age) + 5
               if(gender.equals("Male")){
                   
                   RMR=((9.9*Weight)+( 6.25 * Height ) - ( 4.92 * Age) + 5);
               }
               else{
               //If gender equals to Female Use this Formula to calculate RMR Value of an athlete
                   RMR= ((9.9 * Weight) + ( 6.25 * Height ) - ( 4.92 * Age) -161);

               }
               //Calculating Daily calorie intake Mifflin St.Jeor Equation
               Double DailyCalorieIntake=(RMR*ActivityLevel);
               String CalorieAmount=Double.toString(DailyCalorieIntake);
               
               //Set current Date
               DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       Date date = new Date();
               String today = dateFormat.format(date);
               
               calorie.setTotalCalorie(CalorieAmount); 
               calorie.setDate(today);
               
               //==========================================================================
//               List<MealPlan> plans=mealPlanRepository.findAll();
               dailyCalorieIntakeRepository.save(calorie);
                
		return calorie.getId();
	}
//        @RequestMapping(method=RequestMethod.GET,value="/calorie")
//	public Iterable<DailyCalorieIntake> calorie(){
//		return dailyCalorieIntakeRepository.findAll();
//	}
        @RequestMapping(method=RequestMethod.GET,value="/calorie/{nic}")
	public DailyCalorieIntake lastFeedback(@PathVariable String nic){
		return dailyCalorieIntakeRepository.findFirst1ByNicOrderByDateDesc(nic);
	}
        
        //Update Daily calorie Intake
        
//         @RequestMapping(method=RequestMethod.POST,value="/UpdateCalorie/{nic}")
//            public String update(@RequestBody DailyCalorieIntake calorie,@RequestBody ConsumedMealPlans cal,@PathVariable String nic){
//                //Get daily total calorie
//             String Totalcal = calorie.getTotalCalorie();
//        //get consumed calorie
//        ConsumedMealPlans findByNic = consumedMealPlansRepository.findByNic(nic);
//             String consumedCal= findByNic.getCalorie();
//             
//             Double Total=Double.parseDouble(Totalcal);
//             Double consumed=Double.parseDouble(consumedCal);
//                //Update the total daily calorie amount
//             Double Remaining=(Total-consumed);
//             String RemainingCal=Double.toString(Remaining);
//         
//             dailyCalorieIntakeRepository.update(RemainingCal);
//         
//             return RemainingCal;
//        }
}
