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
@Document(collection="competition")
public class Competition {
    @Id
    private String id;
    private String nic;
    private String date;
    private String stroke;
    private List stroke_reason;
    private List difficulties;
    private List gamePlan;
    private List score;
    private List opponent;
    private List referee;
    private String spectator;
    private List spectator_reason;
    private String env;
    private List env_reason;
    private String cold;
    private List cold_reason;
    private String away;
    private List away_reason;

    public Competition(String id, String nic, String date, String stroke, List stroke_reason, List difficulties, List gamePlan, List score, List opponent, List referee, String spectator, List spectator_reason, String env, List env_reason, String cold, List cold_reason, String away, List away_reason) {
        this.id = id;
        this.nic = nic;
        this.date = date;
        this.stroke = stroke;
        this.stroke_reason = stroke_reason;
        this.difficulties = difficulties;
        this.gamePlan = gamePlan;
        this.score = score;
        this.opponent = opponent;
        this.referee = referee;
        this.spectator = spectator;
        this.spectator_reason = spectator_reason;
        this.env = env;
        this.env_reason = env_reason;
        this.cold = cold;
        this.cold_reason = cold_reason;
        this.away = away;
        this.away_reason = away_reason;
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

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public List getStroke_reason() {
        return stroke_reason;
    }

    public void setStroke_reason(List stroke_reason) {
        this.stroke_reason = stroke_reason;
    }

    public List getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(List difficulties) {
        this.difficulties = difficulties;
    }

    public List getGamePlan() {
        return gamePlan;
    }

    public void setGamePlan(List gamePlan) {
        this.gamePlan = gamePlan;
    }

    public List getScore() {
        return score;
    }

    public void setScore(List score) {
        this.score = score;
    }

    public List getOpponent() {
        return opponent;
    }

    public void setOpponent(List opponent) {
        this.opponent = opponent;
    }

    public List getReferee() {
        return referee;
    }

    public void setReferee(List referee) {
        this.referee = referee;
    }

    public String getSpectator() {
        return spectator;
    }

    public void setSpectator(String spectator) {
        this.spectator = spectator;
    }

    public List getSpectator_reason() {
        return spectator_reason;
    }

    public void setSpectator_reason(List spectator_reason) {
        this.spectator_reason = spectator_reason;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public List getEnv_reason() {
        return env_reason;
    }

    public void setEnv_reason(List env_reason) {
        this.env_reason = env_reason;
    }

    public String getCold() {
        return cold;
    }

    public void setCold(String cold) {
        this.cold = cold;
    }

    public List getCold_reason() {
        return cold_reason;
    }

    public void setCold_reason(List cold_reason) {
        this.cold_reason = cold_reason;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public List getAway_reason() {
        return away_reason;
    }

    public void setAway_reason(List away_reason) {
        this.away_reason = away_reason;
    }

    
}
