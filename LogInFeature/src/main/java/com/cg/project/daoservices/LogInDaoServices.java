package com.cg.project.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.beans.User;

public interface LogInDaoServices extends JpaRepository<User, Integer>{
	
}
