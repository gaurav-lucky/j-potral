package com.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobpostingview")
public class JobPostingView {

	@Id
	@Column(name = "jobId")
	private int jobId;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "responsibilities")
	private String responsibilites;
	@Column(name = "location")
	private String location;
	@Column(name = "salary")
	private String salary;
	@Column(name = "companyId")
	private int companyId;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "keywords")
	private String keywords;
	@Column(name = "state")
	private int state;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResponsibilites() {
		return responsibilites;
	}

	public void setResponsibilites(String responsibilites) {
		this.responsibilites = responsibilites;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "JobPostingView [jobId=" + jobId + ", title=" + title + ", description=" + description
				+ ", responsibilites=" + responsibilites + ", location=" + location + ", salary=" + salary
				+ ", companyId=" + companyId + ", companyName=" + companyName + ", keywords=" + keywords + ", state="
				+ state + "]";
	}

	public JobPostingView(int jobId, String title, String description, String responsibilites, String location,
			String salary, int companyId, String companyName, String keywords, int state) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.responsibilites = responsibilites;
		this.location = location;
		this.salary = salary;
		this.companyId = companyId;
		this.companyName = companyName;
		this.keywords = keywords;
		this.state = state;
	}

}
