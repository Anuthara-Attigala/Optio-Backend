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
@Document(collection="dailyCalorieIntake")
public class DailyCalorieIntake {
    @Id
    private String id;
    private String nic;
    private String date;
    private String totalCalorie;

    public DailyCalorieIntake(String id, String nic, String date, String totalCalorie) {
        this.id = id;
        this.nic = nic;
        this.date = date;
        this.totalCalorie = totalCalorie;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalCalorie() {
        return totalCalorie;
    }

    public void setTotalCalorie(String totalCalorie) {
        this.totalCalorie = totalCalorie;
    }
    
    

}
