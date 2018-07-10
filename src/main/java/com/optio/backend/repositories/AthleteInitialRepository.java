package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.AthleteInitial;
import com.optio.backend.models.Injury;

public interface AthleteInitialRepository extends CrudRepository<AthleteInitial, String>{
	
	AthleteInitial findByNic(String nic);
	
	@Override
	void delete(AthleteInitial deleted);
	
}
