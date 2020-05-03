package com.mkocaturkmen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkocaturkmen.issuemanagement.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
