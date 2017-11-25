package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@XmlRootElement
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id // defines this attributed as the one that identifies the entity
    private int idPerson;
    private String lastname;
    private String firstname;
    private String username;
    private String birthdate; 
    private String email;
	private List<Activity> activity;
	
    public void setIdPerson(int id) {
    	this.idPerson = id;
    }
    
    @XmlAttribute(name="id")
    public int getIdPerson() {
    	return this.idPerson;
    }
    
    public void setName(String name) {
    	this.firstname = name;
    }
    
    @XmlElement(name="firstname")
    public String getName() {
    	return this.firstname;
    }
    
    public void setLastname(String lastname) {
    	this.lastname = lastname;
    }
    
    public String getLastname() {
    	return this.lastname;
    }
    
    public void setBirthdate(String birthdate) {
    	this.birthdate = birthdate;
    }
    
    public String getBirthdate() {
    	return this.birthdate;
    }
    
    @XmlElementWrapper(name="activities")
    @XmlElement(name="activities")
	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

    // add below all the getters and setters of all the private attributes
}