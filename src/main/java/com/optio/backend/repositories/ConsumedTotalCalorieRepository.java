/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.ConsumedTotalCalorie;
import com.optio.backend.models.DailyCalorieIntake;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public interface ConsumedTotalCalorieRepository extends CrudRepository<ConsumedTotalCalorie, String> {
    
    ConsumedTotalCalorie save(ConsumedTotalCalorie consumedTotalCalorie);
}
