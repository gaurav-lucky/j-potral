package com.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interested")
public class Interested {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int ID;

	@Column(name = "jobId")
	private int jobId;

	@Column(name = "jobSeekerId")
	private int jobSeekerId;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	@Override
	public String toString() {
		return "Interested [ID=" + ID + ", jobId=" + jobId + ", jobSeekerId=" + jobSeekerId + "]";
	}

	public Interested(int iD, int jobId, int jobSeekerId) {
		super();
		ID = iD;
		this.jobId = jobId;
		this.jobSeekerId = jobSeekerId;
	}

}
