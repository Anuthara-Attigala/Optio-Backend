/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.Fitness;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Rishni
 */
public interface FitnessRepository extends CrudRepository<Fitness, String>{
    List<Fitness> findByAthleteNIC(String athleteNIC);
}
