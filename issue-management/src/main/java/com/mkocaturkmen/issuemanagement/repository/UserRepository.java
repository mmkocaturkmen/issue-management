package com.mkocaturkmen.issuemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkocaturkmen.issuemanagement.entity.Project;
import com.mkocaturkmen.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	User findByUsername(String username);


}
