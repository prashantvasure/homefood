package com.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	 @Query("select c from Cart c where c.userid = ?1")
	 List <Cart> getCartByUserId(int userid);
	 
	 @Query("delete from Cart c where c.userid = ?1")
	 boolean deleteById(int userid, int itemid);
}

