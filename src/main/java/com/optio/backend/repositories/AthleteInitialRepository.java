package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.AthleteInitial;
import com.optio.backend.models.Injury;

public interface AthleteInitialRepository extends CrudRepository<AthleteInitial, String>{
	
	AthleteInitial findByNic(String nic);
	
	Iterable<AthleteInitial> findByTrainerID(String trainerID);
	
	Iterable<AthleteInitial> findByTrainerIDAndApproved(String trainerID, String Approved);
	
	@Override
	void delete(AthleteInitial deleted);
	
}
