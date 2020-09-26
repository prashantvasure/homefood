package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.dao.*;
import com.model.Cart;
import com.pojo.CartPojo;
@Service  
@Transactional  
public class CartServiceImpl {  
  
   @Autowired  
   private CartDao cartdao;  
     
   
   public boolean saveCart(CartPojo cartPojo) {  
       return cartdao.saveCart(cartPojo);  
   }  
   
   public List<Cart> getCart(int userId) {  
	   return cartdao.getCartByUserId(userId);
   }  
 
   public boolean deleteCart(int userId, int itemId) {  
	   return cartdao.deleteItemCart(userId, itemId);  
   }  
   
}  