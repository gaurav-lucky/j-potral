package com.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.entity.Company;
@Service
public interface CompanyService {
	public List<String> PasswordLookUp(String emailid);

	public Company createCompany(CompanyService com) throws Exception;

	public Company updateCompany(CompanyService js);

	public Company getCompany(int id);

	public void verify(CompanyService c);

	public List<?> getJobsByCompany(int companyId);

	public List<Integer> getCompanyIdFromEmail(String emailid);

}
