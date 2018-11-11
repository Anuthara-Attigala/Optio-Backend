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
 * @author HP
 */

@Document(collection="meals")
public class MealPlan {
    @Id
    private String id;
    private String mealPlan;
    private String description;
    private String calorie;
    private String fat;
    private String protein;
    private String carbs;
//    private String nic;

    public MealPlan(String id, String mealPlan, String description, String calorie, String fat, String protein, String carbs) {
        this.id = id;
        this.mealPlan = mealPlan;
        this.description = description;
        this.calorie = calorie;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    

    
}
