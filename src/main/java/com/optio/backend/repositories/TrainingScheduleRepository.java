package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.TrainingSchedule;

public interface TrainingScheduleRepository extends CrudRepository<TrainingSchedule, String> {
	TrainingSchedule findByNic(String nic);
	

}
