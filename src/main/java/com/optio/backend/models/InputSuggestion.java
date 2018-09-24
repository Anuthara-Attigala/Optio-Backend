/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Rishni
 */
@Document(collection="inputSuggestion")
public class InputSuggestion {
    @Id
    private String id;
    private String nic;
    private String input;
    private List suggestion;

    public InputSuggestion(String id, String nic, String input, List suggestion) {
        this.id = id;
        this.nic = nic;
        this.input = input;
        this.suggestion = suggestion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public List getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(List suggestion) {
        this.suggestion = suggestion;
    }
    
    
    
}
