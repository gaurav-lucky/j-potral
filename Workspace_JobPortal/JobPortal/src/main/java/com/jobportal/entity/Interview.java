package com.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interview")
public class Interview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int ID;
//	
//	@Column(name ="jobId")
//	private int jobId;

	@Column(name = "company")
	private String company;

	@Column(name = "jobseekerid")
	private int jobseekerid;

	@Column(name = "location")
	private String location;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getJobseekerid() {
		return jobseekerid;
	}

	public void setJobseekerid(int jobseekerid) {
		this.jobseekerid = jobseekerid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Interview [ID=" + ID + ", company=" + company + ", jobseekerid=" + jobseekerid + ", location="
				+ location + "]";
	}

	public Interview(int iD, String company, int jobseekerid, String location) {
		super();
		ID = iD;
		this.company = company;
		this.jobseekerid = jobseekerid;
		this.location = location;
	}

}
