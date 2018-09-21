/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Suggestion;
import com.optio.backend.repositories.SuggestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class SuggestionController {
    @Autowired
	SuggestionRepository suggestionRepository;
    
    @RequestMapping(method=RequestMethod.GET,value="/suggestion/{stressor}")
	public List<Suggestion> show(@PathVariable String stressor){
                List<Suggestion> suggestions=(List<Suggestion>) suggestionRepository.findByStressor(stressor);
		return suggestions;
	}
}
