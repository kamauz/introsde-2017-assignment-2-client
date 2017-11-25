package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name="activity")
public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id // defines this attributed as the one that identifies the entity
    private int idActivity;
	private String name; // in kg
	private String description; // in m
	private Type activityType;
	private String place;
	private String startdate;
	private Person person;

	public Activity(String name, String description, String place, String type, String startdate) {
		this.name = name;
		this.description = description;
		this.place = place;
		this.setType(type);
		this.startdate = startdate;
	}

	public Activity() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	
	public Type getType() {
		return this.activityType;
	}

	public void setType(String type) {
		
    	this.activityType = new Type(type);
	}
	
	@XmlTransient
	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	@XmlAttribute(name="id")
	public int getIdActivity() {
		return this.idActivity;
	}
		
}