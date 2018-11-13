/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Injury;
import com.optio.backend.models.StressQuestionnaire;
import com.optio.backend.repositories.InjuryRepository;
import com.optio.backend.repositories.StressQuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class StressQuestionnaireController {
    @Autowired
	StressQuestionnaireRepository stressQuestionnaieRepository;
    
    @RequestMapping(method=RequestMethod.POST,value="/stressquestionnaire")
	public String save(@RequestBody StressQuestionnaire stressquestionnaire){
		stressQuestionnaieRepository.save(stressquestionnaire);
		return stressquestionnaire.getId();
	}
}
