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
@Document(collection="stressquestionnaire")
public class StressQuestionnaire {
    @Id
    private String id;
    private String nic;
    private String q1answer;
    private String q2answer;
    private String q3answer;
    private String q4answer;
    private String q5answer;
    private String q6answer;
    private String q7answer;
    private String q8answer;
    private String q9answer;
    private String q10answer;
    private String q11answer;
    private String q12answer;
    private String q13answer;
    private String q14answer;
    private String q15answer;
    private String q16answer;
    private String q17answer;
    private String q18answer;
    private String q19answer;
    private String q20answer;
    private String q21answer;
    private String q22answer;
    private String q23answer;
    private String q24answer;
    private String q25answer;
    private String q26answer;
    private String q27answer;
    private String date;

    public StressQuestionnaire(String id, String nic, String q1answer, String q2answer, String q3answer, String q4answer, String q5answer, String q6answer, String q7answer, String q8answer, String q9answer, String q10answer, String q11answer, String q12answer, String q13answer, String q14answer, String q15answer, String q16answer, String q17answer, String q18answer, String q19answer, String q20answer, String q21answer, String q22answer, String q23answer, String q24answer, String q25answer, String q26answer, String q27answer, String date) {
        this.id = id;
        this.nic = nic;
        this.q1answer = q1answer;
        this.q2answer = q2answer;
        this.q3answer = q3answer;
        this.q4answer = q4answer;
        this.q5answer = q5answer;
        this.q6answer = q6answer;
        this.q7answer = q7answer;
        this.q8answer = q8answer;
        this.q9answer = q9answer;
        this.q10answer = q10answer;
        this.q11answer = q11answer;
        this.q12answer = q12answer;
        this.q13answer = q13answer;
        this.q14answer = q14answer;
        this.q15answer = q15answer;
        this.q16answer = q16answer;
        this.q17answer = q17answer;
        this.q18answer = q18answer;
        this.q19answer = q19answer;
        this.q20answer = q20answer;
        this.q21answer = q21answer;
        this.q22answer = q22answer;
        this.q23answer = q23answer;
        this.q24answer = q24answer;
        this.q25answer = q25answer;
        this.q26answer = q26answer;
        this.q27answer = q27answer;
        this.date = date;
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

    public String getQ1answer() {
        return q1answer;
    }

    public void setQ1answer(String q1answer) {
        this.q1answer = q1answer;
    }

    public String getQ2answer() {
        return q2answer;
    }

    public void setQ2answer(String q2answer) {
        this.q2answer = q2answer;
    }

    public String getQ3answer() {
        return q3answer;
    }

    public void setQ3answer(String q3answer) {
        this.q3answer = q3answer;
    }

    public String getQ4answer() {
        return q4answer;
    }

    public void setQ4answer(String q4answer) {
        this.q4answer = q4answer;
    }

    public String getQ5answer() {
        return q5answer;
    }

    public void setQ5answer(String q5answer) {
        this.q5answer = q5answer;
    }

    public String getQ6answer() {
        return q6answer;
    }

    public void setQ6answer(String q6answer) {
        this.q6answer = q6answer;
    }

    public String getQ7answer() {
        return q7answer;
    }

    public void setQ7answer(String q7answer) {
        this.q7answer = q7answer;
    }

    public String getQ8answer() {
        return q8answer;
    }

    public void setQ8answer(String q8answer) {
        this.q8answer = q8answer;
    }

    public String getQ9answer() {
        return q9answer;
    }

    public void setQ9answer(String q9answer) {
        this.q9answer = q9answer;
    }

    public String getQ10answer() {
        return q10answer;
    }

    public void setQ10answer(String q10answer) {
        this.q10answer = q10answer;
    }

    public String getQ11answer() {
        return q11answer;
    }

    public void setQ11answer(String q11answer) {
        this.q11answer = q11answer;
    }

    public String getQ12answer() {
        return q12answer;
    }

    public void setQ12answer(String q12answer) {
        this.q12answer = q12answer;
    }

    public String getQ13answer() {
        return q13answer;
    }

    public void setQ13answer(String q13answer) {
        this.q13answer = q13answer;
    }

    public String getQ14answer() {
        return q14answer;
    }

    public void setQ14answer(String q14answer) {
        this.q14answer = q14answer;
    }

    public String getQ15answer() {
        return q15answer;
    }

    public void setQ15answer(String q15answer) {
        this.q15answer = q15answer;
    }

    public String getQ16answer() {
        return q16answer;
    }

    public void setQ16answer(String q16answer) {
        this.q16answer = q16answer;
    }

    public String getQ17answer() {
        return q17answer;
    }

    public void setQ17answer(String q17answer) {
        this.q17answer = q17answer;
    }

    public String getQ18answer() {
        return q18answer;
    }

    public void setQ18answer(String q18answer) {
        this.q18answer = q18answer;
    }

    public String getQ19answer() {
        return q19answer;
    }

    public void setQ19answer(String q19answer) {
        this.q19answer = q19answer;
    }

    public String getQ20answer() {
        return q20answer;
    }

    public void setQ20answer(String q20answer) {
        this.q20answer = q20answer;
    }

    public String getQ21answer() {
        return q21answer;
    }

    public void setQ21answer(String q21answer) {
        this.q21answer = q21answer;
    }

    public String getQ22answer() {
        return q22answer;
    }

    public void setQ22answer(String q22answer) {
        this.q22answer = q22answer;
    }

    public String getQ23answer() {
        return q23answer;
    }

    public void setQ23answer(String q23answer) {
        this.q23answer = q23answer;
    }

    public String getQ24answer() {
        return q24answer;
    }

    public void setQ24answer(String q24answer) {
        this.q24answer = q24answer;
    }

    public String getQ25answer() {
        return q25answer;
    }

    public void setQ25answer(String q25answer) {
        this.q25answer = q25answer;
    }

    public String getQ26answer() {
        return q26answer;
    }

    public void setQ26answer(String q26answer) {
        this.q26answer = q26answer;
    }

    public String getQ27answer() {
        return q27answer;
    }

    public void setQ27answer(String q27answer) {
        this.q27answer = q27answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
