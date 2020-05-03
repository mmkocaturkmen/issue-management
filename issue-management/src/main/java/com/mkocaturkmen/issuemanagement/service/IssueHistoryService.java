package com.mkocaturkmen.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mkocaturkmen.issuemanagement.entity.IssueHistory;

public interface IssueHistoryService {
	
	IssueHistory save(IssueHistory issue);
	
	IssueHistory getById(Long id);
	
	Page<IssueHistory> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueHistory issueHistory);


}
