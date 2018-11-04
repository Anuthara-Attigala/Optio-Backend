/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Injury;
import com.optio.backend.models.InputSuggestion;
import com.optio.backend.repositories.InputSuggestionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rishni
 */
@RestController
public class InputSuggestionController {
    @Autowired
	InputSuggestionRepository inputsuggestionRepository;
	
	@RequestMapping(method=RequestMethod.POST,value="/inputSuggestion")
	public String save(@RequestBody InputSuggestion inputsuggestion){
		inputsuggestionRepository.save(inputsuggestion);
		return inputsuggestion.getId();
	}
        
        @RequestMapping(method=RequestMethod.GET,value="/inputSuggestion/{nic}")
	public List<InputSuggestion> show(@PathVariable String nic){
                List<InputSuggestion> inputsuggestions=(List<InputSuggestion>) inputsuggestionRepository.findByNic(nic);
		return inputsuggestions;
	}
        
        @PutMapping("/inputSuggestion/{id}")
        public ResponseEntity<Object> update(@RequestBody InputSuggestion inputsuggestion,@PathVariable String id)
        {
            Optional<InputSuggestion> inputsuggestionOpttional=inputsuggestionRepository.findById(id);
            if(!inputsuggestionOpttional.isPresent())
            {
                return ResponseEntity.notFound().build();
            }
            inputsuggestion.setId(id);
            inputsuggestionRepository.save(inputsuggestion);
            return ResponseEntity.noContent().build();
        }
}
