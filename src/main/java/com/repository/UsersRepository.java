package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Users;


public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	
	 @Query("select u from Users u where u.id = ?1")
	    Users findByNameEndsWith(int id);
}

