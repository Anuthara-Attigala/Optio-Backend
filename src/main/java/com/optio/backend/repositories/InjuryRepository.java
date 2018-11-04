package com.optio.backend.repositories;


import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.Injury;
import java.util.List;

public interface InjuryRepository extends CrudRepository<Injury, String> {
	List<Injury> findByNic(String nic);

}
