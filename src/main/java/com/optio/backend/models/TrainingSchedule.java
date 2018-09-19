package com.optio.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="trainingSchedule")
public class TrainingSchedule {
	@Id
	String id;
	String nic;
	String normalTrainingDays[];
	public TrainingSchedule(String id, String nic, String[] normalTrainingDays) {
		super();
		this.id = id;
		this.nic = nic;
		this.normalTrainingDays = normalTrainingDays;
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
	public String[] getNormalTrainingDays() {
		return normalTrainingDays;
	}
	public void setNormalTrainingDays(String[] normalTrainingDays) {
		this.normalTrainingDays = normalTrainingDays;
	}
	

}
