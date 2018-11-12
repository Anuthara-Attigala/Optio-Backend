/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.CustomizedPlans;
import com.optio.backend.models.Sleep;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HP
 */
public interface CustomizedPlansRepository extends CrudRepository<CustomizedPlans, String>{
    
}
