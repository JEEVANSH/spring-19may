package com.training.database.demodatabase.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birthDate;
	
	// empty or default constructor for BeanPropertyRowMapper
	public Person() {
		
	}
	
	public Person( String name, String location, Date date) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return birthDate;
	}
	public void setDate(Date date) {
		this.birthDate = date;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" 
	+ location + ", birthDate=" + birthDate + "] \n";
	}
	
	
}
