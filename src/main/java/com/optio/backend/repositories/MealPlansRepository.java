/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.MealPlan;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sewmi
 */
public interface MealPlansRepository extends CrudRepository<MealPlan, String> {
//     List<MealPlan> findByCalorieLessThanOrderByCalorieDesc(String Calorie);
//    // List<MealPlan> findAll();
//     MealPlan findByNic(String nic);
 //MealPlan GetDailyCalorieIntake(String nic);
     List<MealPlan> findAll();
}
