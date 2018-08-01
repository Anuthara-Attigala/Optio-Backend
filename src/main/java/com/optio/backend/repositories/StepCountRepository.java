package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.StepCount;

public interface StepCountRepository extends CrudRepository<StepCount, String>{
	
	Iterable<StepCount> findByNicAndDateGreaterThan(String nic,String date);
	

}
