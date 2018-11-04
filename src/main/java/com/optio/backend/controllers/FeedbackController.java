package com.optio.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optio.backend.models.Feedback;
import com.optio.backend.repositories.FeedbackRepository;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@RequestMapping(method=RequestMethod.POST,value="/feedback")
	public String save(@RequestBody Feedback feedback){
		feedbackRepository.save(feedback);
		return feedback.getId();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/feedback")
	public Iterable<Feedback> feedbacks(){
		return feedbackRepository.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/feedback/{nic}")
	public Feedback lastFeedback(@PathVariable String nic){
		return feedbackRepository.findTopByNicOrderByDateDesc(nic);
	}
}
