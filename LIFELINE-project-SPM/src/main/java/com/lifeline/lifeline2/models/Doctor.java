package com.lifeline.lifeline2.models;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="doctor")
public class Doctor {

	@Id
	@Column(name ="doctor_id")
	String did;
	
	@Column(name="first_name")
	String fname;
	
	@Column(name="last_name")
	String lname;
	
	@Column(name="address")
	String addr;
	
	@Column(name="contact")
	long mobile;
	
	@Column(name="email")
	String email;

	@Column(name="date_of_birth")
	Date birthday;
	
	 
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String toString() {
		return did+" ~ "+fname+" ~ "+lname+" ~ "+addr+" ~ "+mobile+" ~ "+email; 
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
