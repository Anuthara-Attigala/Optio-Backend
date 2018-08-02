/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;

import com.optio.backend.models.BodyComposition;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Rishni
 */
public interface BodyCompositionRepository extends CrudRepository<BodyComposition, String>{

    BodyComposition findByNic(String nic);

    @Override
	void delete(BodyComposition deleted);
    
}
