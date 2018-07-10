package com.optio.backend.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.Injury;

public interface InjuryRepository extends CrudRepository<Injury, String> {
	@Override
	Optional<Injury> findById(String id);
	
	@Override
	void delete(Injury deleted);

}
