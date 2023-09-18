package com.jobportal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {

	private long jobseeker_id = 2L;

	private long skillId;

	private long recruiterId;

	private String jobTitle;
	private String jobDescription;

}