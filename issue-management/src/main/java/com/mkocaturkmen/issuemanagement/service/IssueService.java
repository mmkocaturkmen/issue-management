package com.mkocaturkmen.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mkocaturkmen.issuemanagement.dto.IssueDto;
import com.mkocaturkmen.issuemanagement.entity.Issue;
import com.mkocaturkmen.issuemanagement.entity.IssueHistory;
import com.mkocaturkmen.issuemanagement.util.TPage;


public interface IssueService {
	
	IssueDto save(IssueDto issue);
	
	IssueDto getById(Long id);
	
	TPage<IssueDto> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueDto issue);

}
