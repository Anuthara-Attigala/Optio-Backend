package com.optio.backend.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.Attendance;
import com.optio.backend.repositories.AttendanceRepository;

@RestController
public class AttendanceController {
	@Autowired 
	AttendanceRepository attendanceRepository;
	
	@RequestMapping(method=RequestMethod.POST,value="/attendance")
	public String save(@RequestBody Attendance attendance){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String today = dateFormat.format(date);
		String nic = attendance.getNic();
		if(attendanceRepository.countByNicAndDate(nic, today)==0){
			attendanceRepository.save(attendance);
			return attendance.getId();
		}else{
			return "already saved";
		}
	}

}
