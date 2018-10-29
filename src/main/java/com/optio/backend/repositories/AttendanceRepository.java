package com.optio.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optio.backend.models.Attendance;

public interface AttendanceRepository extends CrudRepository<Attendance,String> {
	
	Attendance findByNic(String nic);
	int countByNic(String nic);
	int countByNicAndDate(String nic,String date);
	
}
