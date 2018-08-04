/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.BodyComposition;
import com.optio.backend.models.Competition;
import com.optio.backend.repositories.BodyCompositionRepository;
import com.optio.backend.repositories.CompetitionRepository;
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
public class CompetitionController {
    @Autowired
	CompetitionRepository competitionRepository;
    
        @RequestMapping(method=RequestMethod.POST,value="/competition")
	public String save(@RequestBody Competition competition){
		competitionRepository.save(competition);
		return competition.getId();
	}
}
