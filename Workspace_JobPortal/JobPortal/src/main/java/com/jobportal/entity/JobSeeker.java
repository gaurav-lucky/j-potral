package com.jobportal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "jobseeker")
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobSeekerId", unique = true, nullable = false)
	private int jobseekerId;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "workEx")
	private int workEx;

	@Column(name = "highestEducation")
	private int highestEducation;

	@Column(name = "skills")
	private String skills;

	@Column(name = "verified")
	private boolean verified;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "interested", joinColumns = @JoinColumn(name = "jobSeekerId", referencedColumnName = "jobSeekerId"), inverseJoinColumns = @JoinColumn(name = "jobId"))
	private List<JobPosting> interestedjobs;

	@OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL)
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "appId")
	private List<JobApplication> jobApplicationList;

	public int getJobseekerId() {
		return jobseekerId;
	}

	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWorkEx() {
		return workEx;
	}

	public void setWorkEx(int workEx) {
		this.workEx = workEx;
	}

	public int getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(int highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "JobSeeker [jobseekerId=" + jobseekerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", password=" + password + ", workEx=" + workEx + ", highestEducation="
				+ highestEducation + ", skills=" + skills + ", verified=" + verified + "]";
	}

	public JobSeeker(int jobseekerId, String firstName, String lastName, String emailId, String password, int workEx,
			int highestEducation, String skills, boolean verified) {
		super();
		this.jobseekerId = jobseekerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.workEx = workEx;
		this.highestEducation = highestEducation;
		this.skills = skills;
		this.verified = verified;
	}

}