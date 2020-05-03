package com.mkocaturkmen.issuemanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mkocaturkmen.issuemanagement.entity.Issue;
import com.mkocaturkmen.issuemanagement.entity.IssueHistory;
import com.mkocaturkmen.issuemanagement.repository.IssueHistoryRepository;
import com.mkocaturkmen.issuemanagement.repository.IssueRepository;
import com.mkocaturkmen.issuemanagement.service.IssueHistoryService;
import com.mkocaturkmen.issuemanagement.service.IssueService;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {
	
	
	private final IssueHistoryRepository issueHistoryRepository;

	public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository) {
		this.issueHistoryRepository = issueHistoryRepository;
	}
	
	@Override
	public IssueHistory save(IssueHistory issueHistory) {
		
		if(issueHistory.getDate() == null) {
			throw new IllegalArgumentException("IssueHistory date can not be null!");
		}
		return issueHistoryRepository.save(issueHistory);
	}


	
	@Override
	public IssueHistory getById(Long id) {
		return issueHistoryRepository.getOne(id);
	}

	@Override
	public Boolean delete(IssueHistory issueHistory) {
		issueHistoryRepository.delete(issueHistory);
		
		return Boolean.TRUE;
	}

	@Override
	public Page<IssueHistory> getAllPageable(Pageable pageable) {
		return issueHistoryRepository.findAll(pageable);
	}

}
