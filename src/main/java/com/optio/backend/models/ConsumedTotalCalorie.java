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
@Document(collection="TotalCalorieConsumption")
public class ConsumedTotalCalorie {
    @Id
    private String id;
    private String totalcalorie;
    private String nic;
    private String date;

    public ConsumedTotalCalorie(String id, String totalcalorie, String nic, String date) {
        this.id = id;
        this.totalcalorie = totalcalorie;
        this.nic = nic;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalcalorie() {
        return totalcalorie;
    }

    public void setTotalcalorie(String totalcalorie) {
        this.totalcalorie = totalcalorie;
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
    
}
