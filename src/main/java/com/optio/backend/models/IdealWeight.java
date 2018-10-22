package com.optio.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="idealWeight")
public class IdealWeight {
	@Id
	String id; 
	String nic;
	int weight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public IdealWeight(String id, String nic, int weight) {
		super();
		this.id = id;
		this.nic = nic;
		this.weight = weight;
	}
	
	

}
