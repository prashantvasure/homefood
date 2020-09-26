package com.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Apartment;

@RepositoryRestResource
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
	
	
	 @Query("select a from Apartment a where a.active = true and a.apartmentname = ?1")
	 Apartment findByName(String apartmentname);
	 
	 @Query("select a.apartmentname from Apartment a where a.active = true")
	 List<String> findallActiveApartment();
	 
	 @Query("delete from Apartment a where a.apartmentname = ?1")
	 boolean deleteByName(String apartmentname);
	
}

