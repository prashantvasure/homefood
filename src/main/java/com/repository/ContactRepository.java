package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
	 @Query("select c from Contact c where c.id = ?1")
	 Contact findByNameEndsWith(int id);
}

