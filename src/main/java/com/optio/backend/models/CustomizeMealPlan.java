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
@Document(collection="rawFoods")
public class CustomizeMealPlan {
    @Id
    String rawFood;
    String calorie;
    String protein;
    String fat;
    String carbs;

    public CustomizeMealPlan(String rawFood, String calorie, String protein, String fat, String carbs) {
        this.rawFood = rawFood;
        this.calorie = calorie;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public String getRawFood() {
        return rawFood;
    }

    public void setRawFood(String rawFood) {
        this.rawFood = rawFood;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }
    
}
