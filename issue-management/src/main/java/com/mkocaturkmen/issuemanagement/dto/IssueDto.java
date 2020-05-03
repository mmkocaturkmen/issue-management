package com.mkocaturkmen.issuemanagement.dto;

import java.util.Date;

import com.mkocaturkmen.issuemanagement.entity.IssueStatus;
import com.mkocaturkmen.issuemanagement.entity.Project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IssueDto {
	private Long id;
	private String description;
	private String details;
	private Date date;
	private IssueStatus issueStatus;
	private UserDto assignee;
	private ProjectDto project;
}
