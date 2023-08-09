package com.vignan.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class person {
	@Id
	int id;
	private String firstname,lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public person(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
