package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement(name="activity_type")
public class Type implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String type;
	private List<Activity> activities;

	public Type(String type) {
		this.type = type;
	}

	public Type() {

	}
	
	@XmlValue
	@JsonValue
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@XmlTransient
	private List<Activity> getActivities() {
		return activities;
	}

	private void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
		
}