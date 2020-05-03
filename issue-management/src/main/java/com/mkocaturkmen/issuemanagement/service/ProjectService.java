package com.mkocaturkmen.issuemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mkocaturkmen.issuemanagement.entity.Issue;
import com.mkocaturkmen.issuemanagement.entity.Project;
import com.mkocaturkmen.issuemanagement.entity.User;

public interface ProjectService {
	
	Project save(Project project);
	
	Project getById(Long id);
	
	List<Project> getByProjectCode(String projectCode);
	
	List<Project> getByProjectCodeContains(String projectCode);
	
	Page<Project> getAllPageable(Pageable pageable);
	
	Boolean delete(Project project);


}
