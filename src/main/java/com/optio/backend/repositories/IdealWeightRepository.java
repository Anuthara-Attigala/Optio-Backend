package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.IdealWeight;

public interface IdealWeightRepository extends CrudRepository<IdealWeight,String> {
	
	IdealWeight findByNic(String nic);

}
