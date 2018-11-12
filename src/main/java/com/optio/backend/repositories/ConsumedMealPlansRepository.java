/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.ConsumedMealPlans;
import com.optio.backend.models.ConsumedTotalCalorie;

import com.optio.backend.models.MealPlan;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public interface ConsumedMealPlansRepository  extends CrudRepository<ConsumedMealPlans, String>{

    //public void save(MealPlan mealPlan);

   // public void save(ConsumedMealPlans consumedMeals);
    ConsumedMealPlans save(ConsumedMealPlans consumedMeals);
    ConsumedMealPlans findByNic(String nic);
   // ConsumedMealPlans findFirst1ByNicOrderByDateDesc(String nic);
    List<ConsumedMealPlans> findByNicAndDateContaining(String nic,String date);
}
