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
@Document(collection="fitness")
public class Fitness {
    @Id
    private String id;
    private String trainerID;
    private String athleteNIC;
    private String athleteName;
    private String shuttleLoad;
    private String type;
    private String flightTime;
    private String fatigueLevel;
    private String fitnessPerDay;
    private String ctl;
    private String fatiguePerDay;
    private String atl;
    private String tsb;
    private String date;

    public Fitness(String id, String trainerID, String athleteNIC, String athleteName, String shuttleLoad, String type, String flightTime, String fatigueLevel, String fitnessPerDay, String ctl, String fatiguePerDay, String atl, String tsb, String date) {
        this.id = id;
        this.trainerID = trainerID;
        this.athleteNIC = athleteNIC;
        this.athleteName = athleteName;
        this.shuttleLoad = shuttleLoad;
        this.type = type;
        this.flightTime = flightTime;
        this.fatigueLevel = fatigueLevel;
        this.fitnessPerDay = fitnessPerDay;
        this.ctl = ctl;
        this.fatiguePerDay = fatiguePerDay;
        this.atl = atl;
        this.tsb = tsb;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(String trainerID) {
        this.trainerID = trainerID;
    }

    public String getAthleteNIC() {
        return athleteNIC;
    }

    public void setAthleteNIC(String athleteNIC) {
        this.athleteNIC = athleteNIC;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getShuttleLoad() {
        return shuttleLoad;
    }

    public void setShuttleLoad(String shuttleLoad) {
        this.shuttleLoad = shuttleLoad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFatigueLevel() {
        return fatigueLevel;
    }

    public void setFatigueLevel(String fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public String getFitnessPerDay() {
        return fitnessPerDay;
    }

    public void setFitnessPerDay(String fitnessPerDay) {
        this.fitnessPerDay = fitnessPerDay;
    }

    public String getCtl() {
        return ctl;
    }

    public void setCtl(String ctl) {
        this.ctl = ctl;
    }

    public String getFatiguePerDay() {
        return fatiguePerDay;
    }

    public void setFatiguePerDay(String fatiguePerDay) {
        this.fatiguePerDay = fatiguePerDay;
    }

    public String getAtl() {
        return atl;
    }

    public void setAtl(String atl) {
        this.atl = atl;
    }

    public String getTsb() {
        return tsb;
    }

    public void setTsb(String tsb) {
        this.tsb = tsb;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
