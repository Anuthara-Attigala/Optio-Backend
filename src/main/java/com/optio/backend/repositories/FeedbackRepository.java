package com.optio.backend.repositories;
import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback,String>{
	
	Feedback findTopByNicOrderByDateDesc(String nic);


}
