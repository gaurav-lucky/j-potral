package com.jobportal.service;

import java.util.List;

import com.jobportal.entity.JobPostingView;
import com.jobportal.entity.JobSeeker;

public interface JobSeekerService {

	public List<?> filterJobs(JobPostingView jpv, List<?> jobIds);

	public JobSeeker createJobSeeker(JobSeeker job) throws Exception;

	public JobSeeker updateJobSeeker(JobSeeker js);

	public JobSeeker getJobSeeker(int id);

	public List<String> PasswordLookUp(String emailid);

	public void verify(JobSeeker j);

	public List<?> searchJobs(String searchString);

	public List<Integer> getUserIdFromEmail(String emailid);
}
