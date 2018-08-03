/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.Sleep;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Rishni
 */
public interface SleepRepository extends CrudRepository<Sleep, String>{
    @Override
	void delete(Sleep deleted);
}
