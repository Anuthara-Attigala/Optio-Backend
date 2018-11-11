/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.DailyCalorieIntake;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HPfindFirst1ByNicOrderByDateDesc
 */
public interface DailyCalorieIntakeRepository extends CrudRepository<DailyCalorieIntake, String> {
	 DailyCalorieIntake findFirst1ByNicOrderByDateDesc(String nic);
         //DailyCalorieIntake findAll(String nic);
         
       // DailyCalorieIntake update(String RemainingCal);
      
}
