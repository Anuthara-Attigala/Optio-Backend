package com.optio.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="injury")
public class Injury {

	@Id
	String id;
	String type;
	String date;
	String recovery;
	String details;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRecovery() {
		return recovery;
	}
	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Injury(String id, String type, String date, String recovery, String details) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.recovery = recovery;
		this.details = details;
	}
	
	
}
