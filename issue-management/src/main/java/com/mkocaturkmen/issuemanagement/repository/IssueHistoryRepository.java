package com.mkocaturkmen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkocaturkmen.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long>  {

}
