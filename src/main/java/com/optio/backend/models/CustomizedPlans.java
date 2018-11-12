/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author HP
 */
@Document(collection="customizedMeals")
public class CustomizedPlans {
    
    @Id
    private String id;
    private List<CustomizeMealPlan> rawFoods;
    private String calorie;
    private String  nic;

    public CustomizedPlans(String id, List<CustomizeMealPlan> rawFoods, String calorie,String nic) {
        this.id = id;
        this.rawFoods = rawFoods;
        this.calorie = calorie;
        this.nic = nic;
    }

    public CustomizedPlans() {
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CustomizeMealPlan> getRawFoods() {
        return rawFoods;
    }

    public void setRawFoods(List<CustomizeMealPlan> rawFoods) {
        this.rawFoods = rawFoods;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
}
