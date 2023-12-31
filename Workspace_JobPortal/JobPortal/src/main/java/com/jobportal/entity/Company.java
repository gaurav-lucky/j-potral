package com.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyId", unique = true, nullable = false)
	private int companyId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="headquarters")
	private String headquarters;
	
	@Column(name="companyUser")
	private String companyUser;
	
	@Column(name="password")
	private String password;
	
	@Column(name="description")
	private String description;

	@Column(name="verified")
	private boolean verified;

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

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getCompanyUser() {
		return companyUser;
	}

	public void setCompanyUser(String companyUser) {
		this.companyUser = companyUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", headquarters=" + headquarters
				+ ", companyUser=" + companyUser + ", password=" + password + ", description=" + description
				+ ", verified=" + verified + "]";
	}

	public Company(int companyId, String companyName, String headquarters, String companyUser, String password,
			String description, boolean verified) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.headquarters = headquarters;
		this.companyUser = companyUser;
		this.password = password;
		this.description = description;
		this.verified = verified;
	}
	
	
	
}
