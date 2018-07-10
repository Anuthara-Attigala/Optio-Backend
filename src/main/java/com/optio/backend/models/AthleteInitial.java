package com.optio.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="athleteInitial")
public class AthleteInitial {
	@Id
	String id;
	String name;
	String nic;
	String joinedDate;
	String dob;
	String trainerID;
	public AthleteInitial(String id, String name, String nic, String joinedDate, String dob, String trainerID) {
		super();
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.joinedDate = joinedDate;
		this.dob = dob;
		this.trainerID = trainerID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
	

}
