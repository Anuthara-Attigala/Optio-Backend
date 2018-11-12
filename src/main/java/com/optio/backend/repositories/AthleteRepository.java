/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.repositories;
import org.springframework.data.repository.CrudRepository;
import com.optio.backend.models.Athlete;
import java.util.List;

/**
 *
 * @author HP
 */
public interface AthleteRepository extends CrudRepository<Athlete, String>{




Athlete findDeitailsByNic(String nic);
  //public List<Athlete> findAll(String nic);
    Athlete findByNic(String nic);
    List<Athlete> findAll();
}
