/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Rishni
 */
@Document(collection="suggestion")
public class Suggestion {
    @Id
    private String id;
    private String suggestionId;
    private String suggestion;
    private String stressor;

    public Suggestion(String id, String suggestionId, String suggestion, String stressor) {
        this.id = id;
        this.suggestionId = suggestionId;
        this.suggestion = suggestion;
        this.stressor = stressor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(String suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getStressor() {
        return stressor;
    }

    public void setStressor(String stressor) {
        this.stressor = stressor;
    }
    
    
}
