package com.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Items;

@RepositoryRestResource
public interface ItemsRepository extends JpaRepository<Items, Integer> {
	
	
	 @Query("select i from Items i where i.id = ?1") Items findByNameEndsWith(int id);
	 
	 @Query("select i.itemname from Items i where i.active = true") List<String> activeItems();
	 
}

