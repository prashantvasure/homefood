package com.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.service.CartServiceImpl;
import com.model.Cart;
import com.pojo.CartPojo;  
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class CartController {  
      
    @Autowired  
    private CartServiceImpl cartservice;  
      
    // http://localhost:8888/api/save-cart
    @PostMapping("save-cart")  
    public boolean saveCart(@RequestBody CartPojo cartPojo) { 
         return cartservice.saveCart(cartPojo);  
    }  
      
    @GetMapping("cart-list/{users_id}")  
    public List<Cart> cart(@PathVariable("users_id") int userId) {  
         return cartservice.getCart(userId);
    }  
    
    // http://localhost:8888/api/delete-cart/3
    @DeleteMapping("delete-cart/{users_id}/{itemId}")  
    public boolean deletecart(@PathVariable("users_id") int userid, @PathVariable("itemId") int itemId) {  
       
        return cartservice.deleteCart(userid, itemId);  
    }  
  
  
}  