package com.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "registration")
public class RegistrationModel {


	@Id
	@GeneratedValue
	@Column(name = "email")
	private String email;
	
	@Column(name = "fname")
	private String fname;
	 
	@Column(name = "fname")
	private String lname;
	
	@Column(name = "username")
	private String username;
	 
	@Column(name = "userPassword")
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
